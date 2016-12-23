# Targets
TARGET = nxtOSEKImpl
TARGET_SOURCES := \
		Middleware/MiddlewareCore.c\
		Middleware/MiddlewareInternalLogic.c\
		Middleware/NetworkInterfaceImplementation.c\
		continuousComponents/ContImplementations.c\
		lib/port.c\
		lib/MessageBuffer.c\
		lib/NetworkMessageBuffer.c\
		lib/NetworkInterface.c\
		messages/Messages.c\
		operations/operations.c\
		RTSCs/mainRootRTSCStateChart.c\
		components/mainComponent.c\
		main.c

		
TOPPERS_OSEK_OIL_SOURCE := ./nxtOSEK.oil
BUILD_MODE = ROM_ONLY

O_PATH ?= build

include ../../ecrobot/ecrobot.mak
