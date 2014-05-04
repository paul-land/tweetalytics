# This is a Makefile, an input file for the GNU 'make' program.
# Build this program with:
#     make
# Clean up .class files with:
#     make clean
# Run the style enforcer with:
#     make style
# Run the tests with:
#     make check

SHELL = bash
SC = scalac
SCFLAGS = -d
S = scala
SFLAGS = -cp
BIN = bin
APP_DATA_SRCS := $(wildcard app/data/*.scala)
APP_SRCS := $(wildcard app/*.scala)
SRCS := $(APP_DATA_SRCS) $(APP_SRCS)

.PHONY: default clean run

default:
	$(SC) $(SCFLAGS) $(BIN) $(SRCS)

clean:
	if test -d bin/app; then rm -r bin/app; fi

run:
	$(S) $(SFLAGS) $(BIN) app.Main
