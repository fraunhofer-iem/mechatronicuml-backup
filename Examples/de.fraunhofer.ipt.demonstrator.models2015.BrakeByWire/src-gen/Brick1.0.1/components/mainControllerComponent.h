/**
 * @file 
 * @author generated
 * @brief Specification of Component of Type: MainController
 * @details This files contains a description of the MainController in form of the MainControllerComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef MAINCONTROLLERCOMPONENT_H_
		#define MAINCONTROLLERCOMPONENT_H_
				// Library
				#include "../lib/types.h"
					#include "../lib/port.h"
					#include "../messages/messages_types.h"
					//#include "../RTSCs/rootMainControllerCmpRTSCStateChart.h"	
			
	
			/**
			 * @brief Forward Declaration of the struct RootMainControllerCmpRTSCStateChart which describes the behavior of MainControllerComponent
			 * 
			 */
			 typedef struct RootMainControllerCmpRTSCStateChart RootMainControllerCmpRTSCStateChart;
			/**
			 * @brief Forward Declaration of the struct MainControllerComponent
			 */
			typedef struct MainControllerComponent MainControllerComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: MainController
			* @details This struct describes a specific Component Instances which is typed over the Component: MainController
			*/
			struct MainControllerComponent {
			
			
						RootMainControllerCmpRTSCStateChart* stateChart;	/**< The RootMainControllerCmpRTSCStateChart of the Component MainController */
				
							Port* drivingControllerPortPort; /**< A Pointer to the Component's Port: DrivingControllerPort */
							Port* loadingControllerPortPort; /**< A Pointer to the Component's Port: LoadingControllerPort */
							Port* pickingUpControllerPortPort; /**< A Pointer to the Component's Port: PickingUpControllerPort */
							Port* colorPortPort; /**< A Pointer to the Component's Port: ColorPort */
					
			
					MainControllerComponent * next;
					
				};
		
			/**
			* @brief This Function intializes the Component: MainController
			* @details All struct members of the struct MainControllerComponent are initialized
			* 
			* @param component The MainControllerComponent to be initialized
			*/	
				void MainControllerComponent_initialize(MainControllerComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: MainController
			* @details Allocates Memory for the struct MainControllerComponent
			* @return A Pointer to the new created MainControllerComponent
			*/
				MainControllerComponent* MainControllerComponent_create(void);
	
			/**
			 * @brief Destroys a Component: MainController
			 * @details Frees the Memory for the struct MainControllerComponent
			 * 
			* @param component The specific MainControllerComponent to be destroyed
			 */
				void MainControllerComponent_destroy(MainControllerComponent* component);
		
			/**
			* @brief Checks if the execution of the Component: MainController  is terminated
			* @details To Check if the execution is terminated the Method is terminated of the stateChart is called
			*		In particular the method RootMainControllerCmpRTSCStateChart::RootMainControllerCmpRTSCStateChart_isInState is called.
			*
			* @param component The specific MainControllerComponent which shall be checked
			* @return True, if the Component is terminated, otherwise false
			*/
				bool_t MainControllerComponent_isTerminated(MainControllerComponent* component);
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: MainController
			* @details The behavior of the Component:  MainController is executed.
			*			In particular the the method RootMainControllerCmpRTSCStateChart::RootMainControllerCmpRTSCStateChart_processStep is called
			* 
			* @param component The MainControllerComponent whose behavior shall be checked
			*/
				void MainControllerComponent_processStep(MainControllerComponent* component);
		
			/**
					 * @brief Get the Port: DrivingControllerPort of an Instance of the Component: MainController
					 * @details The Pointer MainControllerComponent::drivingControllerPortPort is returned
					 * 
					 * @param component The specific Instance MainControllerComponent  of the Component: MainController whose Port shall be returned
					 * @return A Pointer to the Port DrivingControllerPort of the struct MainControllerComponent
					 */
					Port* MainControllerComponent_getDrivingControllerPort(MainControllerComponent* component);
					/**
					 * @brief Get the Port: LoadingControllerPort of an Instance of the Component: MainController
					 * @details The Pointer MainControllerComponent::loadingControllerPortPort is returned
					 * 
					 * @param component The specific Instance MainControllerComponent  of the Component: MainController whose Port shall be returned
					 * @return A Pointer to the Port LoadingControllerPort of the struct MainControllerComponent
					 */
					Port* MainControllerComponent_getLoadingControllerPort(MainControllerComponent* component);
					/**
					 * @brief Get the Port: PickingUpControllerPort of an Instance of the Component: MainController
					 * @details The Pointer MainControllerComponent::pickingUpControllerPortPort is returned
					 * 
					 * @param component The specific Instance MainControllerComponent  of the Component: MainController whose Port shall be returned
					 * @return A Pointer to the Port PickingUpControllerPort of the struct MainControllerComponent
					 */
					Port* MainControllerComponent_getPickingUpControllerPort(MainControllerComponent* component);
					/**
					 * @brief Get the Port: ColorPort of an Instance of the Component: MainController
					 * @details The Pointer MainControllerComponent::colorPortPort is returned
					 * 
					 * @param component The specific Instance MainControllerComponent  of the Component: MainController whose Port shall be returned
					 * @return A Pointer to the Port ColorPort of the struct MainControllerComponent
					 */
					Port* MainControllerComponent_getColorPort(MainControllerComponent* component);

		
			
	


		#endif /* MAINCONTROLLERCOMPONENT_H_ */
