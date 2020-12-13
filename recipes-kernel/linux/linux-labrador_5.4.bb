SUMMARY = "Caninos Loucos Linux Kernel"
SECTION = "kernel"
LICENSE = "GPLv2"


inherit kernel-yocto kernel

# DEPENDS = "ncurses-native"

SRCREV = "bd01c3324c4f91d62fe507d6382f414013a46b4f"

SRC_URI = "git://github.com/bernardocrodrigues/labrador-linux5-unstable.git;protocol=https;branch=${KBRANCH};"
# SRC_URI = "git://github.com/caninos-loucos/labrador-linux.git;protocol=https;branch=${KBRANCH};"

S = "${WORKDIR}/git"

LIC_FILES_CHKSUM ?= "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"


# DEPENDS += "coreutils-native lzop-native"

# Additional file deployed by recent mainline kernels
# FILES_${KERNEL_PACKAGE_NAME}-base += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/modules.builtin.modinfo"

# KERNEL_CONFIG_NAME ?= "${KERNEL_PACKAGE_NAME}-config-${KERNEL_ARTIFACT_NAME}"
# KERNEL_CONFIG_LINK_NAME ?= "${KERNEL_PACKAGE_NAME}-config"

# do_deploy_append() {
#     cp -a ${B}/.config ${DEPLOYDIR}/${KERNEL_CONFIG_NAME}
#     ln -sf ${KERNEL_CONFIG_NAME} ${DEPLOYDIR}/${KERNEL_CONFIG_LINK_NAME}
# }

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# SRC_URI += "file://defconfig"

# SRCREV = "b81ce17afa8f424c07be689bc627e1e610002178"
# SRCREV = "${AUTOREV}"

LINUX_VERSION ?= "5.4.2"
PV = "${LINUX_VERSION}+git${SRCPV}"

# SRCREV_machine_use-head-next = "${AUTOREV}"

KCONFIG_MODE="--alldefconfig"
KERNEL_IMAGETYPE = "uImage"

KBRANCH = "master"

# SRC_URI_append_preempt-rt = " \
#     ${KERNELORG_MIRROR}/linux/kernel/projects/rt/5.4/older/patch-5.4.77-rt43.patch.xz;name=rt-patch \
#     file://preempt-rt.scc \
#     file://preempt-rt-less-latency.scc \
# "
# SRC_URI[rt-patch.md5sum] = "cf96e01e04ec8743e4b24caec76d2c2d"
# SRC_URI[rt-patch.sha256sum] = "a0966fb60ce26f28e4dea5eb9db2e62974e1391470ea1bdb88e2d884a3280dc4"

# # Load USB functions configurable through configfs (CONFIG_USB_CONFIGFS)
# KERNEL_MODULE_AUTOLOAD += "${@bb.utils.contains('COMBINED_FEATURES', 'usbgadget', ' libcomposite', '',d)}"

KBUILD_DEFCONFIG ?= "caninos_k5_defconfig"
# KMACHINE = "caninos"
# KBUILD_DEFCONFIG_apalis-tk1 ?= "tegra_defconfig"
