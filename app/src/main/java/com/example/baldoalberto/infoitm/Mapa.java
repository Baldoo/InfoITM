package com.example.baldoalberto.infoitm;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa extends Fragment implements OnMapReadyCallback {

    SupportMapFragment mapFragment;

    MapView mMapView;
    private GoogleMap mMap;
    private static final LatLng ITM = new LatLng(32.620660, -115.395815);
    LatLng edificioG = new LatLng(32.621125, -115.395842);
    LatLng cafeteria = new LatLng(32.621133, -115.396285);
    LatLng edificioV = new LatLng(32.620362, -115.396583);
    LatLng edificioQ = new LatLng(32.620320, -115.395917);
    LatLng edificioD = new LatLng(32.620023, -115.396482);
    LatLng edificioX = new LatLng(32.620428, -115.394822);
    LatLng edificioH = new LatLng(32.620824, -115.394861);
    LatLng edificioI = new LatLng(32.621007, -115.395297);
    LatLng edificioA = new LatLng(32.620365, -115.397182);
    LatLng edificioM = new LatLng(32.620189, -115.395350);
    LatLng biblioteca = new LatLng(32.620194, -115.398791);
    LatLng edificioL = new LatLng(32.620814, -115.398604);
    LatLng edificioJ = new LatLng(32.621154, -115.394771);
    LatLng edificioE = new LatLng(32.620659, -115.395379);
    LatLng edificioF = new LatLng(32.620715, -115.396229);
    LatLng edificioU = new LatLng(32.621542, -115.396435);


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.mapa, container, false);


        mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.mapView);

        if (mapFragment == null) { FragmentManager fm = getFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();
        mapFragment = SupportMapFragment.newInstance();
        ft.replace(R.id.mapView, mapFragment).commit();

        }

        mapFragment.getMapAsync(this);
        return v;
    }


    public void onMapReady(GoogleMap googleMap) {

        MapsInitializer.initialize(getContext());



        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);


//        SE AÑADEN MARCADORES INDICANDO EL NOMBRE DEL EDIFICIO
//
//        EDIFICIO G

        mMap.addMarker(new MarkerOptions().position(edificioG)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificiog))
                .title("Edificio G").snippet("Edificio G"))
                .showInfoWindow();


        //EDIFICIO A

        mMap.addMarker(new MarkerOptions().position(edificioA)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificioa))
                .title("Edificio A"))
                .showInfoWindow();

        //EDIFICIO Cafeteria

        mMap.addMarker(new MarkerOptions().position(cafeteria)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificioc))
                .title("Cafetería"))
                .showInfoWindow();

        //EDIFICIO D
        mMap.addMarker(new MarkerOptions().position(edificioD)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificiod))
                .title("Edificio D"))
                .showInfoWindow();

        //EDIFICIO E

        mMap.addMarker(new MarkerOptions().position(edificioE)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificioe))
                .title("Edificio G"))
                .showInfoWindow();
        //EDIFICIO F

        mMap.addMarker(new MarkerOptions().position(edificioF)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificiof))
                .title("Edificio F"))
                .showInfoWindow();

        //EDIFICIO H
        mMap.addMarker(new MarkerOptions().position(edificioH)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificioh))
                .title("Edificio H"))
                .showInfoWindow();

        //EDIFICIO I ACTIVIDADES EXTRAESCOLARES

        mMap.addMarker(new MarkerOptions().position(edificioI)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificioi))
                .title("Edificio I"))
                .showInfoWindow();

        //EDIFICIO J IDIOMAS
        mMap.addMarker(new MarkerOptions().position(edificioJ)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificioj))
                .title("Edificio J"))
                .showInfoWindow();

        //EDIFICIO L

        mMap.addMarker(new MarkerOptions().position(edificioL)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificiol))
                .title("Edificio L"))
                .showInfoWindow();

        // EDIFICIO M Mecanica

        mMap.addMarker(new MarkerOptions().position(edificioM)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificiom))
                .title("Edificio M"))
                .showInfoWindow();
        // EDIFICIO Q Quimica

        mMap.addMarker(new MarkerOptions().position(edificioQ)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificioq))
                .title("Edificio Q"))
                .showInfoWindow();

        //EDIFICIO V Servicios Escolares

        mMap.addMarker(new MarkerOptions().position(edificioV)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificiov))
                .title("Edificio V").snippet("Edificio V"))
                .showInfoWindow();

        //EDIFICIO X Electronica

        mMap.addMarker(new MarkerOptions().position(edificioX)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificiox))
                .title("Edificio X"))
                .showInfoWindow();

        //BIBLIOTECA
        mMap.addMarker(new MarkerOptions().position(biblioteca)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificiob))
                .title("Edificio B").snippet("Biblioteca"))
                .showInfoWindow();

        //EDIFICIO U

        mMap.addMarker(new MarkerOptions().position(edificioU)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.edificiou))
                .title("Edificio U").snippet("Edificio U"))
                .showInfoWindow();




        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);



        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(ITM)      // Sets the center of the map to Mountain View
                .zoom(17)                   // Sets the zoom
                .bearing(0)                // Sets the orientation of the camera to east
                .tilt(0)                   // Sets the tilt of the camera to 30 degrees
                .build();                   // Creates a CameraPosition from the builder
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));






    }
}
