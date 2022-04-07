package com.example.infocentre.ui.rukovod;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RukovodViewModel extends ViewModel {


    private MutableLiveData<String> mText;
    private MutableLiveData<String> Text2;
    private MutableLiveData<String> Text3;
    private MutableLiveData<String> Text4;
    private MutableLiveData<String> Text5;
    private MutableLiveData<String> Text6;

    public RukovodViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("1. ЗАО \"ИНФОЦЕНТР\"");
        Text2 = new MutableLiveData<>();
        Text2.setValue("662606, Красноярский край, г. Минусинск, ул. Народная, д. 33\n" +
                "Торговля оптовая компьютерами, периферийными устройствами к компьютерам и программным обеспечением\n" +
                "Руководитель — Зезекало Юрий Николаевич\n");
        Text3 = new MutableLiveData<>();
        Text3.setValue("2. ЗАО \"ИНФОЦЕНТР-АБАКАН\"");
        Text4 = new MutableLiveData<>();
        Text4.setValue("655017, республика Хакасия, г. Абакан, ул. Пушкина, д. 199, к.б\n" +
                "Ремонт компьютеров и периферийного компьютерного оборудования\n" +
                "Руководитель — Зезекало Юрий Николаевич\n");
        Text5 = new MutableLiveData<>();
        Text5.setValue("3. ЗАО \"СИБ-ИНФО КОНСАЛТИНГ\"");
        Text6 = new MutableLiveData<>();
        Text6.setValue("655017, республика Хакасия, г. Абакан, ул. Хакасская, д. 71\n" +
                "Разработка компьютерного программного обеспечения\n" +
                "Руководитель — Зезекало Юрий Николаевич\n");
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

    public LiveData<String> getText4() {
        return Text4;
    }

    public LiveData<String> getText5() {
        return Text5;
    }

    public LiveData<String> getText6() {
        return Text6;
    }
}