require u-boot-ti.inc

# u-boot needs devtree compiler to parse dts files
DEPENDS += "dtc-native"

DESCRIPTION = "u-boot bootloader for TI devices"

LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"

PV = "2014.07-glsdk"
PR = "r4+gitr${SRCPV}"
BRANCH = "p-ti-u-boot-2014.07-glsdk"

SRC_URI = "git://git.omapzoom.org/repo/u-boot.git;protocol=git;branch=${BRANCH}"


SRCREV = "b89e568d9c356d756501b16caad5734970ec25d1"

SPL_BINARY = "MLO"
SPL_UART_BINARY = "u-boot-spl.bin"