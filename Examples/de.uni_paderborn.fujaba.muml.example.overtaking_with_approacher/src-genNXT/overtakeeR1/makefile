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
  RTSCs/rootovertakeeDriverRTSCStateChart.c\
  RTSCs/rootDistanceStateChart.c\
  RTSCs/rootLineStateChart.c\
  components/motorComponent.c\
  components/overtakeeDriverComponent.c\
  components/distanceComponent.c\
  components/lineComponent.c\
  Configuration.c\
  apiCallCode/implementations.c\
  main.c

		
TOPPERS_OSEK_OIL_SOURCE := ./nxtOSEK.oil
BUILD_MODE = ROM_ONLY

O_PATH ?= build

include ../../ecrobot/ecrobot.mak
