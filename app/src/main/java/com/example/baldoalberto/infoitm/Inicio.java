package com.example.baldoalberto.infoitm;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Inicio extends Fragment{

    ListView lst;
    String[] ed={"Edificio A", "Edificio B", "Edificio D", "Edificio E", "Edificio F", "Edificio G", "Edificio H", "Edificio J", "Edificio L", "Edificio M", "Edificio Q", "Edificio V", "Edificio X"};
    String[] descripcionEd ={"En este edificio se encuentra las oficinas de dirección y tramites con financieros.", "En este edificio se encuentra la biblioteca y talleres de lectura.", "En este edificio se encuentra los cubículos de los maestros de Contabilidad.", "En este edificio se encuentran el almacén de Ing. Eléctrica y algunos cubículos de los maestros de esta area.", "En este edificio se encuentra el departamento de Ing. Sistemas Computacionales, así como los cubículos de los maestros de esta misma area.", " En este edificio se encuentra los laboratorios de computación, mantenimiento de cómputo y algunos cubículos de los maestros de esta área.", "En este edificio se encuentra los almacenes de limpieza y el préstamo de materiales pesados.", "En este edificio se encuentra las oficinas del departamento de idiomas, así como oficinas y salones de clases.", "En este edificio se encuentra vinculación.", "En este edificio se encuentran los talleres de Ing. Mecánica y el Servicio Médico.", "En este edificio se encuentran los laboratorios de química, algunos cubículos de los maestros y un almacén de este departamento.", "En este edificio se encuentran los coordinadores de las carreras, el departamento de servicios escolares, el departamento académico de Ing. Química, además de los encargados de servicio social, titulación y traslados. ", "En este edificio se encuentra los laboratorios de Electrónica, un almacén de materiales y algunos cubículos de maestros de esta area."};
    Integer[] imgid={R.drawable.ed_a,R.drawable.inicio,R.drawable.inicio,R.drawable.ed_e,R.drawable.ed_f,R.drawable.ed_g,R.drawable.inicio,R.drawable.ed_j,R.drawable.ed_l,R.drawable.ed_m,R.drawable.inicio,R.drawable.ed_v,R.drawable.inicio};


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.inicio, container, false);

        lst = (ListView) v.findViewById(R.id.lista);
        Customlist customlist = new  Customlist(getActivity(), ed, descripcionEd, imgid);
        lst.setAdapter(customlist);


        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i)
                {
                    case 0:
                        Desc desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;

                    case 1:
                        desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;

                    case 2:
                        desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;

                    case 3:
                        desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;

                    case 4:
                        desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;

                    case 5:
                        desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;

                    case 6:
                        desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;

                    case 7:
                        desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;

                    case 8:
                        desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;

                    case 9:
                        desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;

                    case 10:
                        desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;

                    case 11:
                        desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;

                    case 12:
                        desc = new Desc(i);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, desc, null).addToBackStack(null).commit();
                        break;
                }
            }
        });
        return v;
    }

    @SuppressLint("ValidFragment")
    public static class Desc extends Fragment {
        int i;

        @SuppressLint("ValidFragment")
        public Desc(int i)
        {
            this.i = i;
        }


        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.desc_edificios, container, false);

            TextView tit1 = (TextView) v.findViewById(R.id.tit1);
            TextView tit2 = (TextView) v.findViewById(R.id.tit2);
            TextView tit3 = (TextView) v.findViewById(R.id.tit3);

            TextView desc1 = (TextView) v.findViewById(R.id.desc1);
            TextView desc2 = (TextView) v.findViewById(R.id.desc2);
            TextView desc3 = (TextView) v.findViewById(R.id.desc3);

            ImageView img = (ImageView) v.findViewById(R.id.img);
            TextView ed = (TextView) v.findViewById(R.id.Edificio);

            switch(i)
            {
                case 0: //Edificio A
                     ed.setText("Edificio A");
                img.setImageResource(R.drawable.ed_a);
                tit1.setText("Recursos Financieros");
                desc1.setText("Pagos a los siguientes conceptos:\n\n-Certificado Oficial de Estudios\n-Certificado Parcial\n-Constancia de Estudios “A” (Sin calificaciones)\n-Constancia de Estudios “B” (Con calificaciones)\n-Duplicado de Credencial\n-Curso de inglés\n-Curso de inglés para no estudiantes\n-Curso de titulación (90 hrs)\n-Curso de verano (60 y 75 hrs)\n-Curso de verano (90 hrs)\n-Dictamen técnico de equivalencia\n-Duplicado de certificado oficial de estudios\n-Elaboración de título\n-Examen de acreditación de idioma extranjero\n-Examen especial\n-Examen profesional o acto protocolario de titulación  (Licenciatura y Postgrado)\n-Ficha y examen de admisión nuevo ingreso\n-Inscripción nuevo ingreso\n-Inscripción y reinscripción posgrado\n-Manual de prácticas de química\n-Programas de materias sellados por el ITM (temarios) por materia\n-Reinscripción 2do semestre\n-Reinscripción 3er semestre en adelante\n-Reposición de constancia de liberación de inglés\n-Reposición de tarjetón de acceso\n-Retraso entrega de libros (por día)\n-Semestre cero");
                    break;

                case 1: //Edificio B
                    ed.setText("Edificio B");
                    img.setImageResource(R.drawable.inicio);
                    tit1.setText("Servicios a Usuarios");
                    desc1.setText("-Orientación para uso de los servicios (primer semestre)\n-Consulta interna o préstamo en sala.\n-Préstamo a domicilio (o externo).\n-Préstamo de cubículos de estudio.\n-Catalogo para público.\n-Acceso libre a internet.\n-Acceso a recursos bibliográficos electrónicos.");
                    tit2.setText("Servicios Especializados");
                    desc2.setText("-Hemeroteca\n-Centro de lectura colibrí (la institución cuenta con 1000 ejemplares de literarios como: novelas, cuentos, poesía, etc)\n-Módulo de servicios digitales (acceso a computadoras, edificio B planta alta)\n-Módulo de impresión y fotocopiado\n-Asesorías para manejo de los recursos bibliográficos\n-Sala de proyección de vídeos\n-Sala de capacitación “Martinez Palomera”. ");
                    tit3.setText("Programa a actividades complementarias");
                    desc3.setText("-Fomento a la lectura (Círculos de lectura en diferentes modalidades, inscripciones al inicio del semestre)\n-Desarrollo de habilidades informativas (taller de duración de 20 hrs, 12 hrs presenciales y 8 en línea)\n-Taller DHI\n-Otros talleres de escritura creativa y escritura académica, entre otros.(Inscripciones al inicio de semestre)");
                    break;

                case 2: //Edificio D
                    ed.setText("Edificio D");
                    img.setImageResource(R.drawable.inicio);
                    break;

                case 3: //Edificio E
                    ed.setText("Edificio E");
                    img.setImageResource(R.drawable.ed_e);
                    break;

                case 4: //Edificio F
                    ed.setText("Edificio F");
                    img.setImageResource(R.drawable.ed_f);
                    tit1.setText("Departamento de Sistemas");
                    desc1.setText("-Cargas académicas de los maestros\n-Organización de eventos\n-Documentación del proceso de administración\n-Documentación propia del departamento\n-Documentación de los alumnos\n-Resolver problemas en cargas académicas\n-Justificaciones\n-Comisiones para eventos\n-Control de horarios de laboratorios del G\n-Control de horario de maestros ");
                    break;

                case 5: //Edificio G
                    ed.setText("Edificio G");
                    img.setImageResource(R.drawable.ed_g);
                    tit1.setText("Mantenimiento");
                    desc1.setText("-Mantenimiento de los laboratorios\n-Instalaciones de software");
                    break;

                case 6: //Edificio H
                    ed.setText("Edificio H");
                    img.setImageResource(R.drawable.inicio);
                    break;

                case 7: //Edificio J
                    ed.setText("Edificio J");
                    img.setImageResource(R.drawable.ed_j);
                    tit1.setText("Centro de Información");
                    desc1.setText("-Inscripciones\n-Reinscripciones\n-Curso de inglés\n-Curso de japonés\n-Costo de libros\n-Generadores de los vouchers de pago de los cursos, como de los libros\n-Exámenes");
                    break;

                case 8: //Edificio L
                    ed.setText("Edificio L");
                    img.setImageResource(R.drawable.ed_l);
                    break;

                case 9: //Edificio M
                    ed.setText("Edificio M");
                    img.setImageResource(R.drawable.ed_m);
                    break;

                case 10: //Edificio Q
                    ed.setText("Edificio Q");
                    img.setImageResource(R.drawable.inicio);
                    tit1.setText("Almacén");
                    desc1.setText("-Préstamo de herramientas de laboratorio");
                    break;

                case 11: //Edificio V
                    ed.setText("Edificio V");
                    img.setImageResource(R.drawable.ed_v);
                    tit1.setText("Departamento de Servicios Escolares");
                    desc1.setText("-Alta de Act. Complementarias\n-Alta de Seguro Social (IMSS)\n-Credenciales \n-Documentos Alumnos\n-Documentos de Becas\n-Elaboración de Constancias \n-Equivalencias \n-Inscripciones \n-Reinscripciones");
                    tit2.setText("Coordinación de titulación");
                    desc2.setText("-Documentos de titulación\n-Opciones de titulación");
                    break;

                case 12: //Edificio X
                    ed.setText("Edificio X");
                    img.setImageResource(R.drawable.inicio);
                    break;
            }
            return v;
        }

    }

    @SuppressLint("ValidFragment")
    public class Ventana extends Fragment
    {
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.ventana_emergente, container, false);

            return v;
        }
    }
}
