/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
#ifndef CLOCK_H_
#define CLOCK_H_

#include <time.h>

typedef clock_t Clock;

#define Clock_getTime(aClock) ( (CLOCKS_PER_SEC == 1000) ? (clock() - (aClock)) : ((clock() - (aClock)) * 1000 / CLOCKS_PER_SEC) )

#define Clock_reset(aClock) ((aClock) = clock())

#endif /* CLOCK_H_ */
