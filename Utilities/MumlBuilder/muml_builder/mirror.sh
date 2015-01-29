ECLIPSE=/data/jenkins/custom_config/eclipse
SOURCE=$1
LOCAL_SITE=$2
SITE_NAME=My-Repository

echo Mirroring metadata for $SOURCE
java -jar $ECLIPSE/plugins/org.eclipse.equinox.launcher_*.jar \
     -application org.eclipse.equinox.p2.metadata.repository.mirrorApplication \
     -source $SOURCE \
     -destination $LOCAL_SITE \
     -destinationName "$SITE_NAME" \
     -verbose -ignoreErrors

echo Mirroring artifacts for $SOURCE
java -jar $ECLIPSE/plugins/org.eclipse.equinox.launcher_*.jar \
     -application org.eclipse.equinox.p2.artifact.repository.mirrorApplication \
     -source $SOURCE \
     -destination $LOCAL_SITE \
     -destinationName "$SITE_NAME" \
     -verbose -ignoreErrors
