/**
 * Copyright (c) 2013, Martin Pecka (peci1@seznam.cz)
 * All rights reserved.
 * Licensed under the following BSD License.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * 
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * 
 * Neither the name Martin Pecka nor the
 * names of contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package cz.cuni.mff.peckam.ais;

/**
 * The selection mode of the instrument.
 * 
 * 0101 = Calibration
 * 0110 = Receive Only
 * 0111 = Active Ionospheric Sounder
 * 1000 = Subsurface Sounder 1
 * 1001 = Subsurface Sounder 2
 * 1010 = Subsurface Sounder 3
 * 1011 = Subsurface Sounder 4
 * 1100 = Subsurface Sounder 5
 * 
 * @author Martin Pecka
 */
public enum InstrumentSelectionMode
{
    /** CAL */
    CALIBRATION,
    /** RCV */
    RECEIVE_ONLY,
    /** AIS */
    ACTIVE_IONOSPHERIC_SOUNDER,
    /** SS1 */
    SUBSURFACE_SOUNDER_1,
    /** SS2 */
    SUBSURFACE_SOUNDER_2,
    /** SS3 */
    SUBSURFACE_SOUNDER_3,
    /** SS4 */
    SUBSURFACE_SOUNDER_4,
    /** SS5 */
    SUBSURFACE_SOUNDER_5
}
