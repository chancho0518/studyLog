# 01 DOM & 이벤트 객체

>  DOM의 개념과 JavaScript에서 DOM을 컨트롤 하는 방법과 이벤트 동작에 대해서 정리해 보았습니다.



## 1. DOM이란?

DOM(Document Object Model: 문서객체모델)이란 객체 지향 모델로써 <u>**구조화된 문서**</u>를 표현하는 형식을 의미합니다. 즉, 텍스트로 구성된 문서를 구조화된 형태로 변환되어 다양한 프로그램에서 사용될 수 있는데, 이때 DOM의 개체구조는 '노드 트리'로 표현됩니다.

![](E:\project\AIHub\DOM.png)



### A. HTML 문서에 대한 인터페이스

이러한 DOM은 HTML 문서로부터 생성되지만, DOM이 HTML과 항상 동일하다고 볼 수는 없습니다. 즉, DOM은 XML이나 HTML 문서의 프로그래밍 **인터페이스**로 문서의 __구조화된 표현(structured representation)__을 제공하여 **프로그래밍 언어가 문서구조, 스타일, 내용 등을 변경**할 수 있도록 합니다. 



### B. DOM의 종류

DOM의 종류는 다음과 같습니다. 이 가운데 HTML DOM을 주로 사용하게 될 것입니다.

* **Core DOM**: 모든 문서 타입을 위한 DOM 모델
* **HTML DOM**: HTML 문서를 위한 DOM 모델
* **XML DOM**: 문서를 위한 DOM 모델

HTML DOM이란 HTML 문서를 조작하고 접근하는 표준화된 방법으로 모든 HTML 요소는 HTML DOM을 통해 접근이 가능합니다. 마찬가지로 XML DOM은 XML 문서에 접근하여 그 문서를 다루는 표준화된 방법을 정의하며, 모든 XML 요소는 XML DOM을 통해 접근이 가능합니다. 그리고 Document 객체는 웹페이지를 의미하는데, 웹페이지에 존재하는 HTML 요소에 접근하고자 할때는 반드시 **Document 객체부터 시작**해야 합니다.



### C. Document 메소드

HTML 요소와 관련된 작업을 도와주는 다양한 메소드를 제공합니다.

* HTML 요소의 선택
* HTML 요소의 생성
* HTML 이벤트 헨들러 추가
* HTML 객체의 선택



#### a.HTML 요소의 선택

새로운 HTML 요소를 선택하기 위해 제공되는 메소드는 다음과 같습니다.

|               메소드               |                  내용                   |
| :--------------------------------: | :-------------------------------------: |
|    `document.getElementById()`     |        해당 아이디의 요소를 선택        |
| `document.getElementByClassName()` |     해당 클래스에 속한 요소를 선택      |
|   `document.getElementByName()`    |  해당 name 속성값을 가지는 요소를 선택  |
|   `document.getElementByName()`    | 해당 선택자로 선택되는 요소를 모두 선택 |
|   `document.getElementByName()`    | 해당 선택자로 선택되는 요소를 1개 선택  |



#### b. HTML 요소의 생성

HTML 요소를 생성하기 위해 제공되는 메소드

|          메소드           |                 내용                  |
| :-----------------------: | :-----------------------------------: |
| `document.creatElement()` |        저장된 HTML 요소를 생성        |
|    `document.write()`     | HTML 출력 스트림을 통해 텍스트를 출력 |



#### c. HTML 이벤트 헨들러 추가

HTML 요소에 이벤트 헨들러를 추가하기 위해 제공되는 속성

|              속성              |                   내용                    |
| :----------------------------: | :---------------------------------------: |
| `요소.onclick = function() {}` | 마우스 클릭 이벤트와 연결될 이벤트 헨들러 |



#### D. DOM의 트리 구조(HTML → DOM)

 HTML 문서를 DOM으로 표현할때는 계층화된 구조를 이해하는 것이 중요합니다.

![](E:\project\AIHub\DOMTree.jpg)



## 2. JavaScript & DOM

### A. DOM 요소의 선택

DOM 요소를 선택하여 변수에 담을 수 있습니다.

```javascript
// HTMl <li> 요소를 선택
let selectedItem = document.getElementsByTagName('li);

// ID가 'id'인 요소를 선택
let selectedItem = document.getElementById('id');

// Class가 'odd'인 요소를 선택
let selectedItem = document.getElementByClassName('odd');

// name 속성값이 'first'인 요소를 선택
let selectedItem = document.getElementsByName('first');
```



B. DOM 요소의 스타일 변경

```javascript
// ID가 'even'인 요소를 선택
let selectedItem = document.getElementById('even');

// 선택한 요소의 텍스트 색상을 변경
selectedItem.style.color = 'red';
```



C. DOM 요소의 내용 변경

```javascript
// ID가 'text'인 요소를 선택
let str = document.getElementById('text');

// 선택된 요소의 내용을 변경
str.innerHTML = '요소의 내용을 변경합니다.'
```



## 3. Node 객체

### A. Node & Node Tree

- HTML DOM에서 정보를 저장하는 계층적 단위입니다.
- **Node Tree**는 노드들의 집합으로, 노드 간의 관계를 나타냅니다.
- JavaScript에서는 HTML DOM을 이용하여 Node Tree에 포함된 모든 노드에 접근이 가능합니다.

![](E:\project\AIHub\node.png)



### B. Node 간의 관계

Node Tree의 모든 Node는 서로 **계층적 관계**를 맺고 있습니다.

![](E:\project\AIHub\노드간의 관계.png)



### C. Node의 종류

* **Document Node**: HTML 문서 전체를 나타내는 Node입니다.

* **Element Node**: 모든 HTML 요소는 요소 Node로, Attribute Node를 가질 수 있는 유일한 Node입니다.

* **Comment Node**: HTML 문서의 모든 주석은 주석 Node입니다.

  ※ Comment Node의 경우는 주석을 남기기 위한 목적으로 사용되어 특별히 JavaScript를 통해 접근하지 않습니다.

* **Attribute Node**: 모든 HTML 요소의 속성은 Attribute Node이며, Element Node에 관한 정보를 가지게 되지만, 해당 Attribute Node의 Child Node에는 포함되지 않습니다. 

* **Text Node**: HTML 문서의 모든 Text는 Text Node입니다. 



### D. Node의 값

노드에 대한 정보는 다음과 같은 property를 통해 접근하여 확인할 수 있습니다.

* nodeName(이름)
* nodeValue(값)
* nodeType(타입)

```javascript
// HTML 문서의 모든 자식 node 중에서 첫 번째 node의 이름을 선택
document.childNode[0].nodeName;

// ID가 'heading'인 요소의 첫 번째 Child node의 노드값을 선택
document.getElementById('heading').firstChild.nodeValue;

// ID가 'heading'인 요소의 첫 번째 child node의 타입을 선택
document.getElementById('heading').firstChild.nodeType;
```



## 4. Event

> Event란 웹브라우저가 알려주는 HTML 요소에 대한 **사건의 발생**으로 JavaScript는 발생한 Event에 반응하여 특정 동작을 수행할 수있습니다.

### A. Event type

발생한 Event의 종류는 form, 키보드, 마우스, HTML DOM, Window 객체 등 다양한 종류가 있습니다. 

```javascript
// 마우스 클릭시 chanheText 함수가 실행되는 이벤트 예시
<p onclick="changeText(this)">여기를 클릭하세요!</p>

<script>
function changeText(element) {
	element.innerHTML = "내용이 바뀌었습니다!";
}
</script>
```



### B. Event handler

Event가 발생했을 때 그 처리를 담당하는 함수로 지정된 이벤트가 발생하면, 웹 브라우저는 그 요소에 등록된 Event Handler를 실행시키게 됩니다.

```javascript
// 해당 함수는 HTML 문서가 로드될 때 실행
window.onload = function() {
    // ID가 'text'인 요소를 선택하여 'HTML 문서가 로드되었습니다.'는 text를 표시
    let text = document.getElementById('text');
    text.innerHTML = 'HTML 문서가 로드되었습니다.';
}
```