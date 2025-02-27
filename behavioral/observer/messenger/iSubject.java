// Subject

interface iSubject{
    void subscribe(iObserver observer);

    void unsubscribe(iObserver observer);

    void notify(String message);
}
