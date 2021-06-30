class CD
{
    _cdId;
    _cdName;

    constructor(_cdId,_cdName){
        console.log('from CD constructor')
        this._cdId=_cdId;
        this._cdName=_cdName;
        

    }
    getDetails(){

        return 'CD ID: '+this._cdId+'CD Name: '+this._cdName;

    }
}

class SpecialEditionCD extends CD{
    _specialFeature;

    constructor(_specialFeature)
    {
        super(100,'Titanic');
        this._specialFeature=_specialFeature;
        console.log('special edition cd constructor called');
    }
    getDetails(){

        return super.getDetails()+ 'SpecialFeature is: '+this._specialFeature;

    }
}
  let _cd=new SpecialEditionCD('3D');
  console.log(_cd.getDetails())

class InternationalCD extends CD{

    _language;

    constructor(_language){
        super(100,'titanic')
        this._language=_language;
        console.log('international cd constructor called');

    
    }
    getDetails(){
        return super.getDetails() + 'language is: '+this._language;
    }
}
let cd2=new InternationalCD('english');
console.log(cd2.getDetails());