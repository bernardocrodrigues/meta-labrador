

SUMMARY = "Labrador first stage bootloader"

LICENSE = "CLOSED"

SRC_URI = " file://bootloader.bin"

inherit allarch deploy

ALLOW_EMPT_${PN} = "1"
do_compile[noexec] = "1"

do_deploy () {
	install -m 0755 ${WORKDIR}/bootloader.bin ${DEPLOYDIR}/
}

addtask deploy after do_compile