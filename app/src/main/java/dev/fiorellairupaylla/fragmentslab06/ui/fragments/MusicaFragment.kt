package dev.fiorellairupaylla.fragmentslab06.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.fiorellairupaylla.fragmentslab06.R
import dev.fiorellairupaylla.fragmentslab06.ui.adapter.SongAdapter
import dev.fiorellairupaylla.fragmentslab06.ui.model.SongModel

class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_musica, container, false)
        val rvMusica : RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(ListSong())

        return view
    }

    private fun ListSong(): List<SongModel>{
        var lstSong: ArrayList<SongModel> = ArrayList()
        lstSong.add(SongModel(1,
                            R.drawable.carlos,
                            "Carlos Miguel",
                            "Solo",
                            "100,000",
                            "3:20"))

        lstSong.add(SongModel(2,
            R.drawable.camilo,
            "Amor de Pobre",
            "Indigo",
            "200,000",
            "4:20"))

        lstSong.add(SongModel(3,
            R.drawable.cerati,
            "Persiana America",
            "Solo",
            "300,000",
            "5:20"))

        lstSong.add(SongModel(4,
            R.drawable.adele,
            "Set Fire to the Rain",
            "Adele",
            "400,000",
            "3:45",

            ))
        lstSong.add(SongModel(5,
            R.drawable.daddy,
            "La Gasolina",
            "Yankeee",
            "500,000",
            "3:45",

            ))
        return lstSong
    }
}