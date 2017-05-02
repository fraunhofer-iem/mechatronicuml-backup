// ----------------------------------------------------------------------------
//         ATMEL Crypto-Devices Software Support  -  Colorado Springs, CO -
// ----------------------------------------------------------------------------
// DISCLAIMER:  THIS SOFTWARE IS PROVIDED BY ATMEL "AS IS" AND ANY EXPRESS OR
// IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT ARE
// DISCLAIMED. IN NO EVENT SHALL ATMEL BE LIABLE FOR ANY DIRECT, INDIRECT,
// INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
// OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
// LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
// NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
// EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
// ----------------------------------------------------------------------------

/** \file
 *  \brief 	This file contains definitions of hardware independent functions
 *          inside the Physical layer of the AES132 library.
 *  \author Atmel Crypto Products
 *  \date 	March 14, 2011
 */

#ifndef AES132_PHYSICAL_H
#   define AES132_PHYSICAL_H

#include <stdint.h>


void    aes132p_enable_interface(void);
void    aes132p_disable_interface(void);
uint8_t aes132p_select_device(uint8_t device_id);
uint8_t aes132p_read_memory_physical(uint8_t size, uint16_t word_address, uint8_t *data);
uint8_t aes132p_write_memory_physical(uint8_t count, uint16_t word_address, uint8_t *data);
uint8_t aes132p_resync_physical(void);

#endif
