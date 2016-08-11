package com.example.mvpdemo;

/**
 * Created by Administrator on 2016/8/11.
 */
public class TaskPresenter implements TaskContract.Presenter {

    private TaskContract.View mView;

    public TaskPresenter(TaskContract.View view) {
        this.mView = view;
    }

    @Override
    public void click() {
        mView.showToast();
    }
}
