let romanNumerals = require("../roman-numeral");

describe("Roman Numerals", () => {
  it("Should convert I to 1", () => {
    // given
    let input = "I";

    // when

    let result = romanNumerals.convert(input);

    // then
    expect(result).toBe(1);
  })
});
