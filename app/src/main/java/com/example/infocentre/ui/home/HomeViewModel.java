package com.example.infocentre.ui.home;


import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> Text2;
    private MutableLiveData<String> Text3;


    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ЗАО \"ИнфоЦентр Плюс\"");
        Text2 = new MutableLiveData<>();
        Text2.setValue(
                "✔ Данная организация является действующей\n" +
                        "\n" +
                        "Руководитель:\n" +
                        "Зезекало Юрий Николаевич с 26 ноября 2002 г.\n" +
                        "Нет сведений об учредителях\n" +
                        "\n" +
                        "ОГРН 1021900533104\n" +
                        "ИНН 1901037142\n" +
                        "КПП 190101001\n" +
                        "ОКПО 46224472");

        Text3 = new MutableLiveData<>();
        Text3.setValue(
                "Адрес организации: Республика Хакасия, г.Абакан, ул.Пушкина, д.199,к.б\n" +
                        "Телефоны: +7 390 224-46-65" + "+7 390 235-74-10\n" +
                        "+7 390 235-74-58" + "+7 390 235-77-90\n" +
                        "+7 390 235-78-01" + "+7 390 235-79-36\n" +
                        "+7 913 442-83-00\n" +
                        "Электронная почта:\n" +
                        "infocentre@khakasnet.ru\n" +
                        "sales@infocentre.su");
    }


    private void setContentView(ConstraintLayout constraintLayout) {
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getText2() {
        return Text2;
    }

    public LiveData<String> getText3() {
        return Text3;
    }

}