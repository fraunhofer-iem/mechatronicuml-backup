#ifndef OPERATIONS_H_
#define OPERATIONS_H_
#ifdef __cplusplus
  extern "C" {
#endif

	#include "../types/standardTypes.h"
	#include "../types/customTypes.h"


  	  	  typedef struct AComponentRootStatechartStateChart AComponentRootStatechartStateChart;
  	  	// Operations of RTSC of component aComponent
			
		/**
		 * @brief Implementation stub of operation decreaseInt
 		 * @details This function shall contain the implementation of the operation decreaseInt.
		 * @param myInt 
		 */
		int32_T aComponentDecreaseInt( AComponentRootStatechartStateChart* stateChart, int32_T myInt);
		/**
		 * @brief Implementation stub of operation increaseInt
 		 * @details This function shall contain the implementation of the operation increaseInt.
		 * @param myInt 
		 */
		int32_T aComponentIncreaseInt( AComponentRootStatechartStateChart* stateChart, int32_T myInt);

#ifdef __cplusplus
  }
#endif
#endif /*OPERATIONS_H_ */
