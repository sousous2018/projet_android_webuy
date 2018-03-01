package webuy.khettat.fr.webuy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by TAHIR on 22/02/2018.
 */

public class AchatGroupeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.achat_groupe_activity);

        ImageButton produitButton = (ImageButton) findViewById(R.id.imgProduitButton);

        produitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent produitIntent = new Intent(AchatGroupeActivity.this, AchatGroupeDetailsActivity.class);
                startActivity(produitIntent);
            }
        });
    }
}
