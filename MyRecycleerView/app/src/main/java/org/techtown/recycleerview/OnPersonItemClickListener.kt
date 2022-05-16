package org.techtown.recycleerview

import android.view.View
import org.techtown.recyclerview.PersonAdapter

interface OnPersonItemClickListener {
    fun onItemClick(holder: PersonAdapter.ViewHolder?, view: View?, position: Int)
}