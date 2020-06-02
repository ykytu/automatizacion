# Autor: yneira
  Feature:
    As a user, I want to traslate words in diferents languages by google translate

    @scenario1
    Scenario: Translate from English to Spanish
      Given than kathe wants to use google traductor
      When she translate a word of English to Spanish
        |origin  |destiny |wordi  |
        |english |spanish |table  |
      Then she would to see the word translate in origin language to destiny language
        |worde   |
        |mesa    |