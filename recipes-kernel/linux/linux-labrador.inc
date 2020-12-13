SUMMARY = "Caninos Loucos Linux kernel"
SECTION = "kernel"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM ?= "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel-yocto kernel

SRC_URI = "git://github.com/bernardocrodrigues/labrador-linux.git;protocol=https;branch=${KBRANCH};"
# SRC_URI = "git://github.com/caninos-loucos/labrador-linux.git;protocol=https;branch=${KBRANCH};"
# SRC_URI[sha256sum] = "10f9f0cfc900a248c3861b852e71a185ebf374ee02201289493d824cee810c08"
S = "${WORKDIR}/git"

# DEPENDS += "coreutils-native lzop-native"

# Additional file deployed by recent mainline kernels
# FILES_${KERNEL_PACKAGE_NAME}-base += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/modules.builtin.modinfo"

# KERNEL_CONFIG_NAME ?= "${KERNEL_PACKAGE_NAME}-config-${KERNEL_ARTIFACT_NAME}"
# KERNEL_CONFIG_LINK_NAME ?= "${KERNEL_PACKAGE_NAME}-config"

# do_deploy_append() {
#     cp -a ${B}/.config ${DEPLOYDIR}/${KERNEL_CONFIG_NAME}
#     ln -sf ${KERNEL_CONFIG_NAME} ${DEPLOYDIR}/${KERNEL_CONFIG_LINK_NAME}
# }
