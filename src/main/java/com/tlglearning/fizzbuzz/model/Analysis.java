package com.tlglearning.fizzbuzz.model;

import java.util.EnumSet;
import java.util.Set;

public class Analysis {

  public Set<State> analyze(int value) {                   //Needs to return a Set<State> value (FIZZ value, Buzz Value,
    Set<State> result = EnumSet.noneOf(State.class);

    if(value % 3 == 0) {
      result.add(State.FIZZ);
    }
    if(value % 5 == 0) {
      result.add(State.BUZZ);
    }

    return result;

  }
}
