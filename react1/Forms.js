function Form() {
    return(
         <form>
         <div>   
        <h2>Registration Form</h2>
        <label>Firstname:</label>
        <input type ="text"/>
        <br/><br/>
        <label>Lastname:</label>
        <input type ="text"/>
        <br/><br/>
        <label for="">Email id:</label>
        <input type ="email" name=""id=""/>
        <br/><br/>
        <label for="">Mobile number: </label>
        <input type ="tel" name=""id=""/>
        <br/>
        <h2>Address</h2>
        <input type="street address" name="" id=""placeholder="street address"/>
        <br/><br/>
        <input type="city" name="" id=""placeholder="city"/>
        <br/><br/>
        <input type="state/provision" name="" id=""placeholder="state/provision"/>
        <br/><br/>
        <input type="country" name="" id=""placeholder="country"/>
        <br/><br/>
        <input type="pincode" name="" id=""placeholder="pincode"/>
        <br/><br/>
        <label for="">gender:</label>
        <input type ="radio" name="h" id=""/>
        <label for="">male</label>
        <input type ="radio" name="h" id=""/>
        <label for="">female</label>
        <input type ="radio" name="h" id=""/>
        <label for="">others</label>
        <br/><br/>
        <h2>Personal Details</h2>
        <label for="">date of birth:</label>
        <input type ="date" name="" id=""/>
        <br/><br/>
        <label for="">Education:</label>
        <select name=""id="">
        <option value="">10th</option>
        <option value="">Inter/Dipoma</option>
        <option value="">B.Tech/Degree</option>
        </select>
        <br/><br/>
        <button>submit/</button>        
        <button>reset/</button>
        <br/><br/>
        </div>
        </form>
    );
}
export default Form;