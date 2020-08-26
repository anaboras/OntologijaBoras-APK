package ffos.p3.ontologijaboras;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterListe extends RecyclerView.Adapter<AdapterListe.Red> {

    private List<Ontologija> podaci;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public AdapterListe(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        View view = mInflater.inflate(R.layout.red_liste, roditelj, false);
        return new Red(view);
    }

    @Override
    public void onBindViewHolder(Red red, int position) {
        Ontologija o = podaci.get(position);
        red.sifra.setText(String.valueOf(o.getSifra()));
        red.autor.setText(o.getAutor());
        red.dobioNagradu.setText(o.getDobioNagradu());
        red.rodjenje.setText(String.valueOf(o.getRodjenje()));
        red.vrijemeObjavljivanjaKnjige.setText(String.valueOf(o.getVrijemeObjavljivanjaKnjige()));
        red.nagradjenaKnjiga.setText(String.valueOf(o.getNagradjenaKnjiga()));
        red.zanr.setText(String.valueOf(o.getZanr()));
    }

    @Override
    public int getItemCount() {
        return podaci == null ? 0 : podaci.size();
    }

    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView sifra;
        private TextView autor;
        private TextView dobioNagradu;
        private TextView rodjenje;
        private TextView vrijemeObjavljivanjaKnjige;
        private TextView nagradjenaKnjiga;
        private TextView zanr;

        Red(View itemView) {
            super(itemView);
            sifra = itemView.findViewById(R.id.sifra);
            autor = itemView.findViewById(R.id.autor);
            dobioNagradu = itemView.findViewById(R.id.dobioNagradu);
            rodjenje = itemView.findViewById(R.id.rodjenje);
            vrijemeObjavljivanjaKnjige = itemView.findViewById(R.id.vrijemeObjavljivanjaKnjige);
            nagradjenaKnjiga = itemView.findViewById(R.id.nagradjenaKnjiga);
            zanr = itemView.findViewById(R.id.zanr);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public void setPodaci(List<Ontologija> itemList) {
        this.podaci = itemList;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
