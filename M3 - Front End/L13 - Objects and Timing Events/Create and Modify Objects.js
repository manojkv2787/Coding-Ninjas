var main = function () {
    let student, address;
    function setStudent() {
      student = {
        name: "ABC",
        age: 10,
        "roll no": 50
      };
    }
    function setAddressAndUpdateStudent() {
      address = {
        City: "Mumbai",
        state: "Maharastra"
      };
      student.address = address;
    }
    function deleteRollNumber() {
      delete student["roll no"];
    }
    function getStudent() {
      return student;
    }
    function getAddress() {
      return address;
    }
    return {
      setStudent,
      setAddressAndUpdateStudent,
      deleteRollNumber,
      getStudent,
      getAddress
    };
  };

