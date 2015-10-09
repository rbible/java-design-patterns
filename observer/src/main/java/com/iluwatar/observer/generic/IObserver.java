package com.iluwatar.observer.generic;

public interface IObserver<S extends AbsObservable<S, O, A>, O extends IObserver<S, O, A>, A> {

    void update(S subject, A argument);
}
