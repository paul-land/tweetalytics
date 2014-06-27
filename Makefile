# Run this program with:
#     make
# Run the tests with:
#     make test

SHELL = bash
IR = irb
R = -r
RUN = ./Run.rb
TEST = ./Test.rb

.PHONY: default test

default:
	$(IR) $(R) $(RUN)

test:
	$(TEST)
