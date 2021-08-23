package com.example.studentlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public  class  StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
ArrayList<String> studentList;
itemClicKlistener itemClicKlistener;

    public StudentAdapter(ArrayList<String> studentList) {
        this.studentList = studentList;
    }

    @Override
    public StudentViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student,parent,false);
        return new  StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder( StudentAdapter.StudentViewHolder holder, int position) {
holder.onBind(studentList.get(position));
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView studentTV;
        public StudentViewHolder (View itemView) {

            super(itemView);
            studentTV = itemView.findViewById(R.id.student_name_tv);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClicKlistener.onClick(getAdapterPosition());
                }
            });
        }
        private void onBind(String name){
            studentTV.setText(name);
        }
    }
}

















