package com.example.actcardview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityDetalles extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        TextView tvNombre = findViewById(R.id.tvDetailNombre);
        TextView tvCiudad = findViewById(R.id.tvDetailCiudad);
        TextView tvDescripcion = findViewById(R.id.tvDetailDescripcion);
        TextView tvDireccion = findViewById(R.id.tvDetailDireccion);
        TextView tvTelefono = findViewById(R.id.tvDetailTelefono);
        TextView tvSitioWeb = findViewById(R.id.tvDetailSitioWeb);
        ImageView ivLogo = findViewById(R.id.ivDetailLogo);

        String nombre = getIntent().getStringExtra("nombre");

        // Mostrar datos específicos según el nombre de la institución
        if ("Universidad de la serena".equals(nombre)) {
            tvNombre.setText("Universidad de la serena");
            tvCiudad.setText("la serena");
            tvDescripcion.setText("La Universidad de La Serena es una de las 16 universidades tradicionales de Chile, perteneciente al Consejo de Rectores de las Universidades Chilenas");
            tvDireccion.setText("Avenida Raúl Bitrán Nachary");
            tvTelefono.setText("123456789");
            tvSitioWeb.setText("http://www.Usn.com");
            ivLogo.setImageResource(R.drawable.logo_uls_8);
        } else if ("Universidad Catolica Del Norte".equals(nombre)) {
            tvNombre.setText("Universidad Catolica  Norte");
            tvCiudad.setText("Coquimbo");
            tvDescripcion.setText("La Universidad Católica del Norte (UCN) es una institución de educación superior chilena privada, perteneciente a la Iglesia católica.");
            tvDireccion.setText("Larrondo 1281, Coquimbo3");
            tvTelefono.setText("987654321");
            tvSitioWeb.setText("http://www.UCN.com");
            ivLogo.setImageResource(R.drawable.logoucn);
        }
        else if ("Santo Tomas".equals(nombre)) {
            tvNombre.setText("Santo Tomas");
            tvCiudad.setText("La Serena");
            tvDescripcion.setText("La Universidad Santo Tomás, comúnmente llamada por sus siglas UST, es una universidad privada chilena fundada en 1988.");
            tvDireccion.setText("");
            tvTelefono.setText("45436783");
            tvSitioWeb.setText("http://www.ST.com");
            ivLogo.setImageResource(R.drawable.santotomas);
        }
        else if ("IpChile".equals(nombre)) {
            tvNombre.setText("IpChile");
            tvCiudad.setText("La Serena");
            tvDescripcion.setText("L· IPCHILE es una institución acreditada que ofrece carreras técnicas y profesionales, cursos y diplomados en modalidades presencial ");
            tvDireccion.setText("Avenida Francisco de Aguirre 388 1710128 La Serena Coquimbo");
            tvTelefono.setText("45436783");
            tvSitioWeb.setText("http://www.IpChile.com");
            ivLogo.setImageResource(R.drawable.logoipchile);
        }
        else if ("Inacap".equals(nombre)) {
            tvNombre.setText("Inacap");
            tvCiudad.setText("La Serena");
            tvDescripcion.setText("INACAP ofrece carreras técnicas, profesionales y de educación continua en diversas áreas y modalidades");
            tvDireccion.setText("Av.Francisco De Aguirre #0389 1700000 La Serena Coquimbo.");
            tvTelefono.setText("45436783");
            tvSitioWeb.setText("http://www.Inacap.com");
            ivLogo.setImageResource(R.drawable.logo_inacap);
        }
        // Añadir más condiciones según sea necesario
    }
}