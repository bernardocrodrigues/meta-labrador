SUMMARY = "Labrador first stage bootloader"

LICENSE = "CLOSED"

SRC_URI = "file://u-boot-dtb.img \
		   file://uEnv.txt \
		  "

inherit allarch deploy

ALLOW_EMPT_${PN} = "1"
do_compile[noexec] = "1"

do_deploy () {
	install -m 0755 ${WORKDIR}/u-boot-dtb.img ${DEPLOYDIR}/
	install -m 0755 ${WORKDIR}/uEnv.txt ${DEPLOYDIR}/
}

addtask deploy after do_compile