# Targets
TARGET = nxtOSEKImpl
TARGET_SOURCES := \
  lib/syncChannel.c\
  lib/MessageBuffer.c\
  lib/NetworkInterface.c\
  lib/NetworkMessageBuffer.c\
  lib/port.c\
  messages/Messages.c\
  operations/operations.c\
  Middleware/MiddlewareCore.c\
  Middleware/MiddlewareInternalLogic.c\
  Middleware/NetworkInterfaceImplementation.c\
  RTSCs/rootMotorStateChart.c\
  RTSCs/rootLineStateChart.c\
  RTSCs/rootovertakerDriverRTSCStateChart.c\
  RTSCs/rootDistanceStateChart.c\
  components/motorComponent.c\
  components/lineComponent.c\
  components/overtakerDriverComponent.c\
  components/distanceComponent.c\
  Configuration.c\
  apiCallCode/implementations.c\
  main.c

		
TOPPERS_OSEK_OIL_SOURCE := ./nxtOSEK.oil
BUILD_MODE = ROM_ONLY

O_PATH ?= build

include ../../ecrobot/ecrobot.mak
