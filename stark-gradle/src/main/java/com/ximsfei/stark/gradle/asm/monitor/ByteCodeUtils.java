/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 *                                Apache License
 *                          Version 2.0, January 2004
 *                       http://www.apache.org/licenses/
 *
 *  TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION
 *
 *  1. Definitions.
 *
 *     "License" shall mean the terms and conditions for use, reproduction,
 *     and distribution as defined by Sections 1 through 9 of this document.
 *
 *     "Licensor" shall mean the copyright owner or entity authorized by
 *     the copyright owner that is granting the License.
 *
 *     "Legal Entity" shall mean the union of the acting entity and all
 *     other entities that control, are controlled by, or are under common
 *     control with that entity. For the purposes of this definition,
 *     "control" means (i) the power, direct or indirect, to cause the
 *     direction or management of such entity, whether by contract or
 *     otherwise, or (ii) ownership of fifty percent (50%) or more of the
 *     outstanding shares, or (iii) beneficial ownership of such entity.
 *
 *     "You" (or "Your") shall mean an individual or Legal Entity
 *     exercising permissions granted by this License.
 *
 *     "Source" form shall mean the preferred form for making modifications,
 *     including but not limited to software source code, documentation
 *     source, and configuration files.
 *
 *     "Object" form shall mean any form resulting from mechanical
 *     transformation or translation of a Source form, including but
 *     not limited to compiled object code, generated documentation,
 *     and conversions to other media types.
 *
 *     "Work" shall mean the work of authorship, whether in Source or
 *     Object form, made available under the License, as indicated by a
 *     copyright notice that is included in or attached to the work
 *     (an example is provided in the Appendix below).
 *
 *     "Derivative Works" shall mean any work, whether in Source or Object
 *     form, that is based on (or derived from) the Work and for which the
 *     editorial revisions, annotations, elaborations, or other modifications
 *     represent, as a whole, an original work of authorship. For the purposes
 *     of this License, Derivative Works shall not include works that remain
 *     separable from, or merely link (or bind by name) to the interfaces of,
 *     the Work and Derivative Works thereof.
 *
 *     "Contribution" shall mean any work of authorship, including
 *     the original version of the Work and any modifications or additions
 *     to that Work or Derivative Works thereof, that is intentionally
 *     submitted to Licensor for inclusion in the Work by the copyright owner
 *     or by an individual or Legal Entity authorized to submit on behalf of
 *     the copyright owner. For the purposes of this definition, "submitted"
 *     means any form of electronic, verbal, or written communication sent
 *     to the Licensor or its representatives, including but not limited to
 *     communication on electronic mailing lists, source code control systems,
 *     and issue tracking systems that are managed by, or on behalf of, the
 *     Licensor for the purpose of discussing and improving the Work, but
 *     excluding communication that is conspicuously marked or otherwise
 *     designated in writing by the copyright owner as "Not a Contribution."
 *
 *     "Contributor" shall mean Licensor and any individual or Legal Entity
 *     on behalf of whom a Contribution has been received by Licensor and
 *     subsequently incorporated within the Work.
 *
 *  2. Grant of Copyright License. Subject to the terms and conditions of
 *     this License, each Contributor hereby grants to You a perpetual,
 *     worldwide, non-exclusive, no-charge, royalty-free, irrevocable
 *     copyright license to reproduce, prepare Derivative Works of,
 *     publicly display, publicly perform, sublicense, and distribute the
 *     Work and such Derivative Works in Source or Object form.
 *
 *  3. Grant of Patent License. Subject to the terms and conditions of
 *     this License, each Contributor hereby grants to You a perpetual,
 *     worldwide, non-exclusive, no-charge, royalty-free, irrevocable
 *     (except as stated in this section) patent license to make, have made,
 *     use, offer to sell, sell, import, and otherwise transfer the Work,
 *     where such license applies only to those patent claims licensable
 *     by such Contributor that are necessarily infringed by their
 *     Contribution(s) alone or by combination of their Contribution(s)
 *     with the Work to which such Contribution(s) was submitted. If You
 *     institute patent litigation against any entity (including a
 *     cross-claim or counterclaim in a lawsuit) alleging that the Work
 *     or a Contribution incorporated within the Work constitutes direct
 *     or contributory patent infringement, then any patent licenses
 *     granted to You under this License for that Work shall terminate
 *     as of the date such litigation is filed.
 *
 *  4. Redistribution. You may reproduce and distribute copies of the
 *     Work or Derivative Works thereof in any medium, with or without
 *     modifications, and in Source or Object form, provided that You
 *     meet the following conditions:
 *
 *     (a) You must give any other recipients of the Work or
 *         Derivative Works a copy of this License and
 *
 *     (b) You must cause any modified files to carry prominent notices
 *         stating that You changed the files and
 *
 *     (c) You must retain, in the Source form of any Derivative Works
 *         that You distribute, all copyright, patent, trademark, and
 *         attribution notices from the Source form of the Work,
 *         excluding those notices that do not pertain to any part of
 *         the Derivative Works and
 *
 *     (d) If the Work includes a "NOTICE" text file as part of its
 *         distribution, then any Derivative Works that You distribute must
 *         include a readable copy of the attribution notices contained
 *         within such NOTICE file, excluding those notices that do not
 *         pertain to any part of the Derivative Works, in at least one
 *         of the following places: within a NOTICE text file distributed
 *         as part of the Derivative Works within the Source form or
 *         documentation, if provided along with the Derivative Works or,
 *         within a display generated by the Derivative Works, if and
 *         wherever such third-party notices normally appear. The contents
 *         of the NOTICE file are for informational purposes only and
 *         do not modify the License. You may add Your own attribution
 *         notices within Derivative Works that You distribute, alongside
 *         or as an addendum to the NOTICE text from the Work, provided
 *         that such additional attribution notices cannot be construed
 *         as modifying the License.
 *
 *     You may add Your own copyright statement to Your modifications and
 *     may provide additional or different license terms and conditions
 *     for use, reproduction, or distribution of Your modifications, or
 *     for any such Derivative Works as a whole, provided Your use,
 *     reproduction, and distribution of the Work otherwise complies with
 *     the conditions stated in this License.
 *
 *  5. Submission of Contributions. Unless You explicitly state otherwise,
 *     any Contribution intentionally submitted for inclusion in the Work
 *     by You to the Licensor shall be under the terms and conditions of
 *     this License, without any additional terms or conditions.
 *     Notwithstanding the above, nothing herein shall supersede or modify
 *     the terms of any separate license agreement you may have executed
 *     with Licensor regarding such Contributions.
 *
 *  6. Trademarks. This License does not grant permission to use the trade
 *     names, trademarks, service marks, or product names of the Licensor,
 *     except as required for reasonable and customary use in describing the
 *     origin of the Work and reproducing the content of the NOTICE file.
 *
 *  7. Disclaimer of Warranty. Unless required by applicable law or
 *     agreed to in writing, Licensor provides the Work (and each
 *     Contributor provides its Contributions) on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *     implied, including, without limitation, any warranties or conditions
 *     of TITLE, NON-INFRINGEMENT, MERCHANTABILITY, or FITNESS FOR A
 *     PARTICULAR PURPOSE. You are solely responsible for determining the
 *     appropriateness of using or redistributing the Work and assume any
 *     risks associated with Your exercise of permissions under this License.
 *
 *  8. Limitation of Liability. In no event and under no legal theory,
 *     whether in tort (including negligence), contract, or otherwise,
 *     unless required by applicable law (such as deliberate and grossly
 *     negligent acts) or agreed to in writing, shall any Contributor be
 *     liable to You for damages, including any direct, indirect, special,
 *     incidental, or consequential damages of any character arising as a
 *     result of this License or out of the use or inability to use the
 *     Work (including but not limited to damages for loss of goodwill,
 *     work stoppage, computer failure or malfunction, or any and all
 *     other commercial damages or losses), even if such Contributor
 *     has been advised of the possibility of such damages.
 *
 *  9. Accepting Warranty or Additional Liability. While redistributing
 *     the Work or Derivative Works thereof, You may choose to offer,
 *     and charge a fee for, acceptance of support, warranty, indemnity,
 *     or other liability obligations and/or rights consistent with this
 *     License. However, in accepting such obligations, You may act only
 *     on Your own behalf and on Your sole responsibility, not on behalf
 *     of any other Contributor, and only if You agree to indemnify,
 *     defend, and hold each Contributor harmless for any liability
 *     incurred by, or claims asserted against, such Contributor by reason
 *     of your accepting any such warranty or additional liability.
 *
 *  END OF TERMS AND CONDITIONS
 *
 *  APPENDIX: How to apply the Apache License to your work.
 *
 *     To apply the Apache License to your work, attach the following
 *     boilerplate notice, with the fields enclosed by brackets "[]"
 *     replaced with your own identifying information. (Don't include
 *     the brackets!)  The text should be enclosed in the appropriate
 *     comment syntax for the file format. We also recommend that a
 *     file or class name and description of purpose be included on the
 *     same "printed page" as the copyright notice for easier
 *     identification within third-party archives.
 *
 *  Copyright 2018 pengfengwang
 *
 *  Licensed under the Apache License, Version 2.0 (the "License")
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.ximsfei.stark.gradle.asm.monitor;

import com.android.annotations.NonNull;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.util.Textifier;
import org.objectweb.asm.util.TraceMethodVisitor;

import java.util.List;
import java.util.Optional;

/**
 * Bytecode generation utilities to work around some ASM / Dex issues.
 */
public class ByteCodeUtils {

    public static final String CONSTRUCTOR = "<init>";
    public static final String CLASS_INITIALIZER = "<clinit>";
    private static final Type NUMBER_TYPE = Type.getObjectType("java/lang/Number");
    private static final Method SHORT_VALUE = Method.getMethod("short shortValue()");
    private static final Method BYTE_VALUE = Method.getMethod("byte byteValue()");

    /**
     * Generates unboxing bytecode for the passed type. An {@link Object} is expected to be on the
     * stack when these bytecodes are inserted.
     *
     * ASM takes a short cut when dealing with short/byte types and convert them into int rather
     * than short/byte types. This is not an issue on the jvm nor Android's ART but it is an issue
     * on Dalvik.
     *
     * @param mv the {@link GeneratorAdapter} generating a method implementation.
     * @param type the expected un-boxed type.
     */
    public static void unbox(GeneratorAdapter mv, Type type) {
        if (type.equals(Type.SHORT_TYPE)) {
            mv.checkCast(NUMBER_TYPE);
            mv.invokeVirtual(NUMBER_TYPE, SHORT_VALUE);
        } else if (type.equals(Type.BYTE_TYPE)) {
            mv.checkCast(NUMBER_TYPE);
            mv.invokeVirtual(NUMBER_TYPE, BYTE_VALUE);
        } else {
            mv.unbox(type);
        }
    }

    /**
     * Converts the given method to a String.
     */
    public static String textify(@NonNull MethodNode method) {
        Textifier textifier = new Textifier();
        TraceMethodVisitor trace = new TraceMethodVisitor(textifier);
        method.accept(trace);
        String ret = "";
        for (Object line : textifier.getText()) {
            ret += line;
        }
        return ret;
    }

    /**
     * Pushes an array on the stack that contains the value of all the given variables.
     */
    static void newVariableArray(
            @NonNull GeneratorAdapter mv,
            @NonNull List<LocalVariable> variables) {
        mv.push(variables.size());
        mv.newArray(Type.getType(Object.class));
        loadVariableArray(mv, variables, 0);
    }

    /**
     * Given an array on the stack, it loads it with the values of the given variables stating at
     * offset.
     */
    static void loadVariableArray(
            @NonNull GeneratorAdapter mv,
            @NonNull List<LocalVariable> variables, int offset) {
        // we need to maintain the stack index when loading parameters from, as for long and double
        // values, it uses 2 stack elements, all others use only 1 stack element.
        for (int i = offset; i < variables.size(); i++) {
            LocalVariable variable = variables.get(i);
            // duplicate the array of objects reference, it will be used to store the value in.
            mv.dup();
            // index in the array of objects to store the boxed parameter.
            mv.push(i);
            // Pushes the appropriate local variable on the stack
            mv.visitVarInsn(variable.type.getOpcode(Opcodes.ILOAD), variable.var);
            // potentially box up intrinsic types.
            mv.box(variable.type);
            // store it in the array
            mv.arrayStore(Type.getType(Object.class));
        }
    }

    /**
     * Given an array with values at the top of the stack, the values are unboxed and stored
     * on the given variables. The array is popped from the stack.
     */
    static void restoreVariables(
            @NonNull GeneratorAdapter mv,
            @NonNull List<LocalVariable> variables) {
        for (int i = 0; i < variables.size(); i++) {
            LocalVariable variable = variables.get(i);
            // Duplicates the array on the stack;
            mv.dup();
            // Sets up the index
            mv.push(i);
            // Gets the Object value
            mv.arrayLoad(Type.getType(Object.class));
            // Unboxes to the type of the local variable
            mv.unbox(variable.type);
            // Restores the local variable
            mv.visitVarInsn(variable.type.getOpcode(Opcodes.ISTORE), variable.var);
        }
        // Pops the array from the stack.
        mv.pop();
    }

    /**
     * Converts Types to LocalVariables, assuming they start from variable 0.
     */
    static List<LocalVariable> toLocalVariables(@NonNull List<Type> types) {
        List<LocalVariable> variables = Lists.newArrayList();
        int stack = 0;
        for (int i = 0; i < types.size(); i++) {
            Type type = types.get(i);
            variables.add(new LocalVariable(type, stack));
            stack += type.getSize();
        }
        return variables;
    }

    /**
     * Given a *STORE opcode, it returns the type associated to the variable, or null if
     * not a valid opcode.
     */
    static Type getTypeForStoreOpcode(int opcode) {
        switch (opcode) {
            case Opcodes.ISTORE:
                return Type.INT_TYPE;
            case Opcodes.LSTORE:
                return Type.LONG_TYPE;
            case Opcodes.FSTORE:
                return Type.FLOAT_TYPE;
            case Opcodes.DSTORE:
                return Type.DOUBLE_TYPE;
            case Opcodes.ASTORE:
                return Type.getType(Object.class);
        }
        return null;
    }

    /**
     * Converts a class name from the Java language naming convention (foo.bar.baz) to the JVM
     * internal naming convention (foo/bar/baz).
     */
    @NonNull
    public static String toInternalName(@NonNull String className) {
        return className.replace('.', '/');
    }

    /**
     * Gets the class name from a class member internal name, like {@code com/foo/Bar.baz:(I)V}.
     */
    @NonNull
    public static String getClassName(@NonNull String memberName) {
        Preconditions.checkArgument(memberName.contains(":"), "Class name passed as argument.");
        return memberName.substring(0, memberName.indexOf('.'));
    }

    /**
     * Returns the package name, based on the internal class name. For example, given 'com/foo/Bar'
     * return 'com.foo'.
     *
     * <p>Returns {@link Optional#empty()} for classes in the anonymous package.
     */
    @NonNull
    public static Optional<String> getPackageName(@NonNull String internalName) {
        List<String> parts = Splitter.on('/').splitToList(internalName);
        if (parts.size() == 1) {
            return Optional.empty();
        }

        return Optional.of(Joiner.on('.').join(parts.subList(0, parts.size() - 1)));
    }

    /**
     * Returns true if a method is annotated with the passed annotation, false otherwise.
     *
     * @param method the asm method object.
     * @param annotationInternalName annotation internal name like Ljava/lang/Annotation;
     */
    public static boolean isAnnotatedWith(MethodNode method, String annotationInternalName) {
        List<AnnotationNode> annotations = (List<AnnotationNode>) method.invisibleAnnotations;
        if (annotations != null && isAnnotationPartOf(annotations, annotationInternalName)) {
            return true;
        }
        annotations = (List<AnnotationNode>) method.visibleAnnotations;
        return annotations != null && isAnnotationPartOf(annotations, annotationInternalName);
    }

    private static boolean isAnnotationPartOf(
            @NonNull List<AnnotationNode> annotations, @NonNull String annotationInternalName) {

        for (AnnotationNode annotation : annotations) {
            if (annotation.desc.equals(annotationInternalName)) {
                return true;
            }
        }
        return false;
    }
}
