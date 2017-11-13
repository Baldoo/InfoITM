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
import android.widget.TextView;

public class Inicio extends Fragment{

    ListView lst;
    String[] ed={"Edificio B - Servicio a Usuarios", "Edificio L - Vinculación", "Edificio A - Recursos Financieros", "Edificio D", "Edificio V - Departamente de Servicios Escolares", "Edificio Q - Almacén", "Edificio F", "Edificio G - Mantenimiento", "Edificio M", "Edificio E", "Edificio J - Centro de Idiomas", "Edificio H", "Edificio X"};
    String[] descripcionEd ={"En este edificio se encuentra la biblioteca y talleres de lectura.", "En este edificio se encuentra vinculación.", "En este edificio se encuentra las oficinas de dirección y tramites con financieros.", "En este edificio se encuentra los cubículos de los maestros de Contabilidad.", "En este edificio se encuentran los coordinadores de las carreras, el departamento de servicios escolares, el departamento académico de Ing. Química, además de los encargados de servicio social, titulación y traslados.", "En este edificio se encuentran los laboratorios de química, algunos cubículos de los maestros y un almacén de este departamento.", "En este edificio se encuentra el departamento de Ing. Sistemas Computacionales, así como los cubículos de los maestros de esta misma área.", "En este edificio se encuentra los laboratorios de computación, mantenimiento de cómputo y algunos cubículos de los maestros de esta área.", "En este edificio se encuentran los talleres de Ing. Mecánica y el Servicio Médico.", "En este edificio se encuentran el almacén de Ing. Eléctrica y algunos cubículos de los maestros de esta área.", "En este edificio se encuentra las oficinas del departamento de idiomas, así como oficinas y salones de clases.", "En este edificio se encuentra los almacenes de limpieza y el préstamo de materiales pesados.", "En este edificio se encuentra los laboratorios de Electrónica, un almacén de materiales y algunos cubículos de maestros de esta área."};
    Integer[] imgid={R.drawable.inicio,R.drawable.ed_l,R.drawable.ed_a,R.drawable.inicio,R.drawable.ed_v,R.drawable.inicio,R.drawable.ed_f,R.drawable.ed_g,R.drawable.ed_m,R.drawable.ed_e,R.drawable.ed_j,R.drawable.inicio,R.drawable.inicio};


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

                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:

                        break;

                    case 5:

                        break;

                    case 6:
                        break;

                    case 7:
                        break;

                    case 8:

                        break;

                    case 9:

                        break;

                    case 10:
                        break;

                    case 11:
                        break;

                    case 12:
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
            TextView edificio = (TextView) v.findViewById(R.id.Edificio);

            switch(i)
            {
                case 0:

                    break;

                case 1:

                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 10:
                    break;

                case 11:
                    break;

                case 12:
                    break;
            }
            return v;
        }

    }

}
