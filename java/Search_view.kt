package com.project.innerpeace

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail_sub_view.*
import java.util.*


class Search_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_view)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val search = findViewById<SearchView>(R.id.searchView)
        search.background = null
        val listView = findViewById<ListView>(R.id.search_list)

        val names=arrayOf("Android","Java","Python","Kotlin","Bye","Contribute")

        val adapter:ArrayAdapter<String?> = ArrayAdapter(
            this, R.layout.simple_list_item_1, names
        )

        listView.adapter = adapter
//        names.setTextColor(Color.BLACK)

        search.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                search.clearFocus()
                if (names.contains(p0)){
                    adapter.filter.filter(p0)
                }else{
                    Toast.makeText(applicationContext, "Item not found", Toast.LENGTH_LONG).show()
                }
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                adapter.filter.filter(p0)
                return false
            }

        })
    }
//    var Searchtext: EditText? = null
//    private var adapter: SearchAdapter? = null
//    var bt_mic: ImageButton? = null
//    private var subList: MutableList<SearchAdapter?>? = null
//    private val subs: List<SearchAdapter>? = null
//
//    /* access modifiers changed from: protected */
//    public override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_search_view)
//        fillExampleList()
//        setUpRecyclerView()
//        initToolbar()
//        Searchtext = findViewById<View>(R.id.search_input) as EditText
//        Searchtext!!.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(
//                charSequence: CharSequence,
//                i: Int,
//                i1: Int,
//                i2: Int
//            ) {
//            }
//
//            override fun onTextChanged(
//                charSequence: CharSequence,
//                i: Int,
//                i1: Int,
//                i2: Int
//            ) {
//            }
//
//            override fun afterTextChanged(editable: Editable) {
//                filterQuery(editable.toString())
//            }
//        })
//    }
//
//    private fun fillExampleList() {
//        val subList = ArrayList<Sub_Item?>()
//        subList.add(Sub_Item(R.drawable.ic_filter_list_black_24dp, "One", "Ten"))
//        subList.add(Sub_Item(R.drawable.ic_filter_list_black_24dp, "Two", "Eleven"))
//        subList.add(Sub_Item(R.drawable.ic_filter_list_black_24dp, "Three", "Twelve"))
//        subList.add(Sub_Item(R.drawable.ic_filter_list_black_24dp, "Four", "Thirteen"))
//        subList.add(Sub_Item(R.drawable.ic_filter_list_black_24dp, "Five", "Fourteen"))
//        subList.add(Sub_Item(R.drawable.ic_filter_list_black_24dp, "Six", "Fifteen"))
//        subList.add(Sub_Item(R.drawable.ic_filter_list_black_24dp, "Seven", "Sixteen"))
//        subList.add(
//            Sub_Item(
//                R.drawable.ic_filter_list_black_24dp,
//                "Eight",
//                "Seventeen"
//            )
//        )
//        subList.add(Sub_Item(R.drawable.ic_filter_list_black_24dp, "Nine", "Eighteen"))
//    }
//
//    private fun setUpRecyclerView() {
//        val recyclerView =
//            findViewById<View>(R.id.RecyclerView) as RecyclerView
//        recyclerView.setHasFixedSize(true)
//        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
//        adapter = SearchAdapter(sub_recycler_view)
//        recyclerView.layoutManager = layoutManager
//        recyclerView.adapter = adapter
//    }
//
//    private fun initToolbar() {
//        setSupportActionBar(findViewById<View>(R.id.toolbar) as Toolbar)
//        supportActionBar!!.title = "Filter Activity"
//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//    }
//
//    /* access modifiers changed from: private */
//    fun filterQuery(text: String?) {
//        val filterdNames: ArrayList<Sub_Item?> = ArrayList<Sub_Item?>()
//        for (s in subList!!) {
//            if (s.getText1().toLowerCase().contains(text) || s.getText2().toLowerCase()
//                    .contains(text)
//            ) {
//                filterdNames.add(s)
//            }
//        }
//        adapter.setFilter(filterdNames)
//    }
}