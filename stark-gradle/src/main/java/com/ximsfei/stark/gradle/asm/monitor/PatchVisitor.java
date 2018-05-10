package com.ximsfei.stark.gradle.asm.monitor;

import com.android.annotations.NonNull;

import org.objectweb.asm.ClassVisitor;

public class PatchVisitor extends MonitorVisitor {

    private static final class VisitorBuilder implements MonitorVisitor.VisitorBuilder {

        @Override
        public MonitorVisitor build(@NonNull AsmClassNode classNode, @NonNull ClassVisitor classVisitor) {
            return new PatchVisitor(classNode, classVisitor);
        }

        @Override
        public String getMangledRelativeClassFilePath(@NonNull String originalClassFilePath) {
            return originalClassFilePath;
        }
    }

    @NonNull
    public static final MonitorVisitor.VisitorBuilder VISITOR_BUILDER = new VisitorBuilder();

    public PatchVisitor(AsmClassNode classAndInterfaceNode, ClassVisitor classVisitor) {
        super(classAndInterfaceNode, classVisitor);
    }
}
