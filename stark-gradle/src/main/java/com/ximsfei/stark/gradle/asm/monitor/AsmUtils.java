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
import com.android.annotations.Nullable;
import com.google.common.collect.ImmutableList;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InnerClassNode;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/**
 * ASM related utilities methods.
 */
public class AsmUtils {

    /**
     * Abstraction for a provider for {@link ClassNode} instances for a class name.
     */
    public interface ClassNodeProvider {

        /**
         * load class bytes and return a {@link ClassNode}.
         *
         * @param className the requested class to be loaded.
         * @return a {@link ClassReader} with the class' bytes or null if the class file cannot be
         * located.
         * @throws IOException when locating/reading the class file.
         */
        @Nullable
        ClassNode loadClassNode(@NonNull String className)
                throws IOException;
    }

    public static class DirectoryBasedClassReader implements ClassNodeProvider {

        private final File binaryFolder;

        public DirectoryBasedClassReader(File binaryFolder) {
            this.binaryFolder = binaryFolder;
        }

        @Override
        @Nullable
        public ClassNode loadClassNode(@NonNull String className) {
            File outerClassFile = new File(binaryFolder, className + ".class");
            if (outerClassFile.exists()) {
//                logger.verbose("Parsing %s", outerClassFile);
                try (InputStream outerClassInputStream =
                             new BufferedInputStream(new FileInputStream(outerClassFile))) {
                    return readClass(new ClassReader(outerClassInputStream));
                } catch (IOException e) {
//                    logger.error(e, "Cannot parse %s", className);
                }
            }
            return null;
        }
    }

    public static class ClassLoaderBasedClassReader implements ClassNodeProvider {
        private final ClassLoader classLoader;

        public ClassLoaderBasedClassReader(ClassLoader classLoader) {
            this.classLoader = classLoader;
        }

        @Override
        public ClassNode loadClassNode(String className) {
            try (InputStream is = classLoader.getResourceAsStream(className + ".class")) {
                if (is == null) {
                    throw new IOException("Failed to find byte code for " + className);
                }

                ClassReader classReader = new ClassReader(is);
                ClassNode node = new ClassNode();
                classReader.accept(node, ClassReader.EXPAND_FRAMES);
                return node;
            } catch (Exception e) {
                // logging
            }
            return null;
        }
    }

    public static final ClassNodeProvider classLoaderBasedProvider =
            (className) -> {
                ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
                try (InputStream is = classLoader.getResourceAsStream(className + ".class")) {
                    if (is == null) {
                        throw new IOException("Failed to find byte code for " + className);
                    }

                    ClassReader classReader = new ClassReader(is);
                    ClassNode node = new ClassNode();
                    classReader.accept(node, ClassReader.EXPAND_FRAMES);
                    return node;
                }
            };

    public static class JarBasedClassReader implements ClassNodeProvider {

        private final File file;

        public JarBasedClassReader(File file) {
            this.file = file;
        }

        @Nullable
        @Override
        public ClassNode loadClassNode(@NonNull String className)
                throws IOException {
            try (JarFile jarFile = new JarFile(file)) {
                ZipEntry entry = jarFile.getEntry(className.replace(".", "/") + ".class");
                if (entry != null) {
                    try (InputStream is = jarFile.getInputStream(entry)) {
                        return readClass(new ClassReader(is));
                    }
                }
            }
            return null;
        }

    }

    @NonNull
    public static List<AnnotationNode> getInvisibleAnnotationsOnClassOrOuterClasses(
            @NonNull ClassNodeProvider classReader,
            @NonNull ClassNode classNode)
            throws IOException {

        ImmutableList.Builder<AnnotationNode> listBuilder = ImmutableList.builder();
        do {
            @SuppressWarnings("unchecked")
            List<AnnotationNode> invisibleAnnotations = classNode.invisibleAnnotations;
            if (invisibleAnnotations != null) {
                listBuilder.addAll(invisibleAnnotations);
            }
            String outerClassName = getOuterClassName(classNode);
            classNode =
                    outerClassName != null
                            ? classReader.loadClassNode(outerClassName)
                            : null;
        } while (classNode != null);
        return listBuilder.build();
    }

    /**
     * Read a {@link ClassNode} from a class name and all it's implemented interfaces also as {@link
     * ClassNode}. Store the class and its interfaces into a {@link AsmClassNode} instance.
     *
     * @param classReaderProvider provider to read class bytes from storage
     * @param parentClassName     requested class name
     * @return null if the parentClassName cannot be located by the provider otherwise an {@link
     * AsmClassNode} encapsulating the class and its directly implemented interfaces
     * @throws IOException when bytes cannot be read.
     */
    @Nullable
    public static AsmClassNode readClassAndInterfaces(
            @NonNull ClassNodeProvider classReaderProvider,
            @NonNull String parentClassName,
            @NonNull String childClassName,
            int targetApi)
            throws IOException {
        ClassNode classNode = loadClass(classReaderProvider, parentClassName);
        if (classNode == null) {
            // Could not locate parent class. This is as far as we can go locating parents.
//            logger.warning(
//                    "IncrementalVisitor parseParents could not locate %1$s "
//                            + "which is an ancestor of project class %2$s.\n"
//                            + "%2$s is not eligible for hot swap. \n"
//                            + "If the class targets a more recent platform than %3$d,"
//                            + " add a @TargetApi annotation to silence this warning.",
//                    parentClassName, childClassName, targetApi);
            return null;
        }
        // read the parent.
        AsmClassNode parentClassNode =
                classNode.superName != null
                        ? readClassAndInterfaces(
                        classReaderProvider,
                        classNode.superName,
                        childClassName,
                        targetApi)
                        : null;

        // now read all implemented interfaces.
        ImmutableList.Builder<AsmInterfaceNode> interfaces = ImmutableList.builder();
        if (!readInterfaces(classNode, classReaderProvider, interfaces)) {
            // if we cannot read any implemented interfaces, return null;
            return null;
        }
        return new AsmClassNode(classNode, parentClassNode, interfaces.build());
    }

    /**
     * Loads an interface hierarchy and build a {@link AsmInterfaceNode}
     *
     * @param classReaderProvider provider of {@link ClassNode} instances.
     * @param interfaceName       name of the interface to load the hierarchy for.
     * @param classNode           the class implementing the interface name.
     * @return the interface hierarchy for interfaceName or null if class bytes cannot be located or
     * loaded.
     * @throws IOException when loading bytes from disk failed.
     */
    @Nullable
    private static AsmInterfaceNode readInterfaceHierarchy(
            ClassNodeProvider classReaderProvider,
            String interfaceName,
            ClassNode classNode)
            throws IOException {

        ClassNode interfaceNode = loadClass(classReaderProvider, interfaceName);
        ImmutableList.Builder<AsmInterfaceNode> builder = ImmutableList.builder();

        if (interfaceNode != null) {
            return readInterfaces(interfaceNode, classReaderProvider, builder)
                    ? new AsmInterfaceNode(interfaceNode, builder.build())
                    : null;
        } else {
//            logger.warning(
//                    "Cannot load interface %$1s, which is implemented"
//                            + "by %2$s, therefore %2$s will not be eligible for hotswap.",
//                    interfaceName, classNode.name);
            return null;
        }
    }

    /**
     * Read all directly implemented interfaces from the passed {@link ClassNode} instance.
     *
     * @param classNode           the class
     * @param classReaderProvider a provider to read class bytes from storage
     * @param interfacesList      a builder to store the list of AsmInterfaceNode for each directly
     *                            implemented interfaces, can be empty after method returns.
     * @return true if implemented interfaces could all be loaded, false otherwise.
     * @throws IOException when bytes cannot be read
     */
    static boolean readInterfaces(
            @NonNull ClassNode classNode,
            @NonNull ClassNodeProvider classReaderProvider,
            @NonNull ImmutableList.Builder<AsmInterfaceNode> interfacesList)
            throws IOException {
        for (String anInterface : (List<String>) classNode.interfaces) {
            AsmInterfaceNode interfaceNode =
                    readInterfaceHierarchy(classReaderProvider, anInterface, classNode);
            if (interfaceNode != null) {
                interfacesList.add(interfaceNode);
            } else {
                return false;
            }
        }
        return true;
    }

    @NonNull
    public static ClassNode readClass(@NonNull ClassReader classReader) {
        ClassNode node = new ClassNode();
        classReader.accept(node, ClassReader.EXPAND_FRAMES);
        return node;
    }

    @Nullable
    public static AsmClassNode loadClass(
            @NonNull ClassNodeProvider classBytesReader,
            @NonNull ClassNode classNode,
            int targetApi)
            throws IOException {

        AsmClassNode parentedClassNode =
                classNode.superName != null
                        ? readClassAndInterfaces(
                        classBytesReader,
                        classNode.superName,
                        classNode.name,
                        targetApi)
                        : null;

        // read interfaces
        ImmutableList.Builder<AsmInterfaceNode> interfaces = ImmutableList.builder();
        if (!readInterfaces(classNode, classBytesReader, interfaces)) {
            return null;
        }

        return new AsmClassNode(classNode, parentedClassNode, interfaces.build());
    }

    @Nullable
    static ClassNode loadClass(
            @NonNull ClassNodeProvider classBytesReader,
            @NonNull String className)
            throws IOException {

        ClassNode classNode = classBytesReader.loadClassNode(className);
        if (classNode != null) {
            return classNode;
        }
        return classLoaderBasedProvider.loadClassNode(className);
    }

    @NonNull
    public static ClassNode readClass(ClassLoader classLoader, String className)
            throws IOException {
        try (InputStream is = classLoader.getResourceAsStream(className + ".class")) {
            if (is == null) {
                throw new IOException("Failed to find byte code for " + className);
            }

            ClassReader parentClassReader = new ClassReader(is);
            ClassNode node = new ClassNode();
            parentClassReader.accept(node, ClassReader.EXPAND_FRAMES);
            return node;
        }
    }

    @Nullable
    public static ClassNode parsePackageInfo(
            @NonNull File inputFile) throws IOException {

        File packageFolder = inputFile.getParentFile();
        File packageInfoClass = new File(packageFolder, "package-info.class");
        if (packageInfoClass.exists()) {
            try (InputStream reader = new BufferedInputStream(new FileInputStream(packageInfoClass))) {
                ClassReader classReader = new ClassReader(reader);
                return readClass(classReader);
            }
        }
        return null;
    }

    @Nullable
    static String getOuterClassName(@NonNull ClassNode classNode) {
        if (classNode.outerClass != null) {
            return classNode.outerClass;
        }
        if (classNode.innerClasses != null) {
            @SuppressWarnings("unchecked")
            List<InnerClassNode> innerClassNodes = (List<InnerClassNode>) classNode.innerClasses;
            for (InnerClassNode innerClassNode : innerClassNodes) {
                if (innerClassNode.name.equals(classNode.name)) {
                    return innerClassNode.outerName;
                }
            }
        }
        return null;
    }
}