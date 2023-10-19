package Lesson8.MVPVM.view;

import Lesson8.MVPVM.viewModel.TaskViewModel;

import java.util.List;

public interface TaskView {
    void showTasks(List<TaskViewModel> taskViewModels);
}