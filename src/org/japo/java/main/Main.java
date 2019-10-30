/* 
Copyright 2019  Brayan C. Sanchez Arenas - brayancamilo.sanchez.alum2iescap.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.GregorianCalendar;



/**
 *
 * @author Brayan C. Sanchez Arenas
 */
public class Main {

    public static void main(String[] args) {
        //Variables
        int D;
        int M;
        int A;
        //GregorianCalendar();
        GregorianCalendar gc = new GregorianCalendar();
        
        //Obtener valores
        D = gc.get(Calendar.DAY_OF_MONTH);
        M = gc.get(Calendar.MONTH) + 1;
        A = gc.get(Calendar.YEAR);
        // Mensaje
        System.out.printf("Fecha del sistema ....:  %02d/%02d/%d%n",D,M,A);
    }
}
