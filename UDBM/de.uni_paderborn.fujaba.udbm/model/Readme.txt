This folder contains an Eclipse project with the meta model of the UDBM integration in terms of a 
Fujaba model file. You may check out this project into your runtime workspace to open this model.

The model is provided in two Fujaba formats, namely fpr und ctr. Typically fpr is the
preferred format but since there are still other projects which have
dependencies to the ctr versions these are also provided.

The classes in this project are plain Java and independent of any meta-model technology. They can, 
however, be used in EMF meta-models by using EDataType Wrappers. For creating an EDataType Wrapper,
add a new EDataType to your model, give it a name, and set the instance class property to the full
qualified class name of the UDBM class you want to use. Then, you can add attributes using the
self-defined EDataType to your EMF models and the code generation will generate a reference to
the UDBM class. 
