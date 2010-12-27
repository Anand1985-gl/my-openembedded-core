require matchbox-theme-sato.inc

PV = "0.1+svnr${SRCPV}"
PR = "r0"

SRC_URI = "svn://svn.o-hand.com/repos/sato/trunk;module=matchbox-sato;proto=http"

EXTRA_OECONF += "${@base_contains('MACHINE_FEATURES', 'qvga', '--with-mode=qvga', '',d)}"

S = "${WORKDIR}/matchbox-sato"
