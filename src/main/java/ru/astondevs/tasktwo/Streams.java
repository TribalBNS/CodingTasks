package ru.astondevs.tasktwo;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public Collection<Integer> positiveCollection(Collection<Integer> initial) {
        return initial.stream().map(Math::abs).collect(Collectors.toList());
    }

    public Collection<Integer> positiveMyliplyingNegativeMinusingCollection(Collection<Integer> initial) {
        return initial.stream().map(x -> x % 2 == 0 ? x * 100 : x - 100).collect(Collectors.toList());
    }

    public List<String> surnamesStartingWithACollection(Collection<String> initial) {
        return initial.stream().filter(x -> x.startsWith("А")).collect(Collectors.toList());
    }
}
