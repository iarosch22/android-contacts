package ru.yandex.practicum.contacts.presentation.base;

import androidx.recyclerview.widget.DiffUtil;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public class BaseListDiffCallback<V extends ListDiffInterface<V>> extends DiffUtil.ItemCallback<V> {
    @Override
    public boolean areItemsTheSame(@NonNull V oldItem, @NonNull V newItem) {
        return oldItem.hashCode() == newItem.hashCode();
    }

    @Override
    public boolean areContentsTheSame(@NonNull V oldItem, @NonNull V newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull V oldItem, @NonNull V newItem) {
        return newItem;
    }
}
