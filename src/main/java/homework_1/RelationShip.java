package homework_1;

enum RelationShip {
    PARENT,
    CHILD,

}
interface ObjectIs {

    default String objectIs(RelationShip relate) {
        return switch (relate) {
            case PARENT -> "Дети";
            case CHILD -> "Родители";
        };
    }
}
