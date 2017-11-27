import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetReportComponent } from './reports.component';

describe('ReportsComponent', () => {
  let component: GetReportComponent;
  let fixture: ComponentFixture<GetReportComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetReportComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetReportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});