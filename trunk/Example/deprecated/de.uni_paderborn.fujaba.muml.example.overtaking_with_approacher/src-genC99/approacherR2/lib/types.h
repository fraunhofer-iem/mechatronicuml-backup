/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/

/**
 * @file
 * @author badrobot
 * @brief In this files the data types which are used in the generated Code are defined
 * @warning These types shall be adapted for a specific target platform
 */
#ifndef TYPES_H_
#define TYPES_H_

typedef unsigned short ushort_t;

/**
 * @brief Type to specify an Integers
 */
typedef int int_t;

/**
 * @brief Type to specify a Real Numbers
 */
typedef double real_t;

/**
 * @brief Type to specify a String
 */
typedef char* string_t;
//typedef unsigned char byte;

/**
 * @brief Type to specify a Boolean Value
 */
#include <stdbool.h>
#ifndef _STDBOOL_H
#define bool	_Bool
#define true	1
#define false	0
#endif
typedef bool bool_t;

/**
 * @brief Deprecated
 */
typedef enum ContinuousType {
	BOOL_T, INT_T, REAL_T
} ContinuousType;

/**
 * @brief Deprecated
 */
typedef union ContinuousValue {
	bool_t bool_val;
	int_t int_val;
	real_t float_val;
} ContinuousValue;

#endif /* TYPES_H_ */
