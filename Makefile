DEBUG_OPTS = -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005
compile = true

.PHONY: info
info:
	java --version
	@echo "=========="
	mvn --version

.PHONY: clean
clean:
ifeq ($(compile), true)
	mvn clean
endif

TEST_TARGET = com.coderwu.algorithm.nowcoder.contest.weekly.round18.MainATest

.PHONY: test
test: clean
	mvn test -Dmaven.surefire.debug="$(_DEBUG_OPTS)" \
	-Dtest=$(TEST_TARGET)

.PHONY: test-debug
test-debug: 
	make test _DEBUG_OPTS=$(DEBUG_OPTS)