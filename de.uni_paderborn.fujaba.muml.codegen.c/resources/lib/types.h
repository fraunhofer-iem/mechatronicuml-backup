/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#ifndef TYPES_H_
#define TYPES_H_

typedef unsigned short ushort_t;

typedef int int_t;
typedef double real_t;
typedef char* string_t;
typedef unsigned char byte;

#include <stdbool.h>
#ifndef _STDBOOL_H
#define bool	_Bool
#define true	1
#define false	0
#endif
typedef bool bool_t;

typedef enum ContinuousType {
	BOOL_T, INT_T, REAL_T
} ContinuousType;

typedef union ContinuousValue {
	bool_t bool_val;
	int_t int_val;
	real_t float_val;
} ContinuousValue;

#endif /* TYPES_H_ */
