package com.hivian.lydia_test.ui.home.list

import androidx.recyclerview.widget.RecyclerView
import com.hivian.lydia_test.data.model.domain.RandomUserDomain
import com.hivian.lydia_test.databinding.RandomUserItemBinding
import com.hivian.lydia_test.ui.home.HomeViewModel

class RandomUserViewHolder(
    private val binding: RandomUserItemBinding
) : RecyclerView.ViewHolder(binding.root){

    fun bind(viewModel: HomeViewModel, item: RandomUserDomain) {
        binding.viewModel = viewModel
        binding.article = item
        binding.executePendingBindings()
    }
}