Currently there are compilation errors because ExtendableElement.annotations reference was removed.

This should be easily fixable, by using ExtendableElement.extensions reference instead.

For this, it is necessary to introduce a new Subclass of "Extension".