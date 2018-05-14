package com.ximsfei.stark.gradle.asm.monitor;

import com.ximsfei.stark.gradle.StarkConstants;

import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.HashMap;
import java.util.List;

class SuperClassRedirection {
    private static final HashMap<String, String> SUPER_REDIRECT_MAP = new HashMap<>();

    static {
        SUPER_REDIRECT_MAP.put("android/app/Application", StarkConstants.STARK_CORE_RUNTIME_PACKAGE + "/StarkApplication");
        SUPER_REDIRECT_MAP.put("android/app/Activity", StarkConstants.STARK_CORE_RUNTIME_PACKAGE + "/StarkActivity");
        SUPER_REDIRECT_MAP.put("android/app/ListActivity", StarkConstants.STARK_CORE_RUNTIME_PACKAGE + "/StarkListActivity");
        SUPER_REDIRECT_MAP.put("android/app/NativeActivity", StarkConstants.STARK_CORE_RUNTIME_PACKAGE + "/StarkNativeActivity");
        SUPER_REDIRECT_MAP.put("android/app/ExpandableListActivity", StarkConstants.STARK_CORE_RUNTIME_PACKAGE + "/StarkExpandableListActivity");
        SUPER_REDIRECT_MAP.put("android/app/Service", StarkConstants.STARK_CORE_RUNTIME_PACKAGE + "/StarkService");
        SUPER_REDIRECT_MAP.put("android/app/IntentService", StarkConstants.STARK_CORE_RUNTIME_PACKAGE + "/StarkIntentService");
    }

    static void redirect(ClassNode classNode) {
        if (SUPER_REDIRECT_MAP.keySet().contains(classNode.superName)) {
            if (SUPER_REDIRECT_MAP.values().contains(classNode.name)) {
                return;
            }
            String originSuper = classNode.superName;
            String redirectSuper = SUPER_REDIRECT_MAP.get(classNode.superName);
            classNode.superName = redirectSuper;
            for (MethodNode methodNode : (List<MethodNode>) classNode.methods) {
                AbstractInsnNode insn = methodNode.instructions.getFirst();
                while (insn != null) {
                    switch (insn.getType()) {
                        case AbstractInsnNode.FIELD_INSN:
                            FieldInsnNode fieldInsnNode = (FieldInsnNode) insn;
                            if (fieldInsnNode.owner.equals(originSuper)) {
                                fieldInsnNode.owner = redirectSuper;
                            }
                            break;
                        case AbstractInsnNode.METHOD_INSN:
                            MethodInsnNode methodInsnNode = (MethodInsnNode) insn;
                            if (methodInsnNode.owner.equals(originSuper)) {
                                methodInsnNode.owner = redirectSuper;
                            }
                            break;
                        case AbstractInsnNode.INVOKE_DYNAMIC_INSN:
                            break;
                    }
                    insn = insn.getNext();
                }
            }
        }
    }
}
